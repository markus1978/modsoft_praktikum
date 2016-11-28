package de.hub.modsoft.twittersearch.main;

import com.google.common.base.Objects;
import de.hub.modsoft.twittersearch.BooleanBinaryOp;
import de.hub.modsoft.twittersearch.BooleanCondition;
import de.hub.modsoft.twittersearch.BooleanExpression;
import de.hub.modsoft.twittersearch.Condition;
import de.hub.modsoft.twittersearch.Dot;
import de.hub.modsoft.twittersearch.FieldExpression;
import de.hub.modsoft.twittersearch.FieldReference;
import de.hub.modsoft.twittersearch.IntCondition;
import de.hub.modsoft.twittersearch.Model;
import de.hub.modsoft.twittersearch.Not;
import de.hub.modsoft.twittersearch.Search;
import de.hub.modsoft.twittersearch.Twitter;
import de.hub.modsoft.twittersearch.TwitterFieldDeclaration;
import de.hub.modsoft.twittersearch.TwitterObjectTypeDeclaration;
import de.hub.modsoft.twittersearch.TwitterSearchPackage;
import de.hub.modsoft.twittersearch.Type;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class Main {
  /**
   * @returns the field declaration that is represented by the given field expression.
   */
  public static TwitterFieldDeclaration fieldDeclaration(final FieldExpression fieldExpr) {
    if ((fieldExpr instanceof FieldReference)) {
      return ((FieldReference)fieldExpr).getFieldDeclaration();
    } else {
      if ((fieldExpr instanceof Dot)) {
        FieldReference _right = ((Dot)fieldExpr).getRight();
        return _right.getFieldDeclaration();
      }
    }
    return null;
  }
  
  /**
   * @returns true, iff all fields in the given field expression exist within the context of the given object type.
   */
  public static boolean fieldExists(final FieldExpression fieldExpr, final TwitterObjectTypeDeclaration objectType) {
    boolean _xifexpression = false;
    if ((fieldExpr instanceof Dot)) {
      boolean _xblockexpression = false;
      {
        FieldExpression _left = ((Dot)fieldExpr).getLeft();
        TwitterFieldDeclaration _fieldDeclaration = Main.fieldDeclaration(_left);
        final Type leftFieldType = _fieldDeclaration.getType();
        boolean _xifexpression_1 = false;
        if ((leftFieldType instanceof TwitterObjectTypeDeclaration)) {
          FieldReference _right = ((Dot)fieldExpr).getRight();
          _xifexpression_1 = Main.fieldExists(_right, ((TwitterObjectTypeDeclaration)leftFieldType));
        } else {
          boolean _and = false;
          if (!false) {
            _and = false;
          } else {
            FieldExpression _left_1 = ((Dot)fieldExpr).getLeft();
            boolean _fieldExists = Main.fieldExists(_left_1, objectType);
            _and = _fieldExists;
          }
          _xifexpression_1 = _and;
        }
        _xblockexpression = _xifexpression_1;
      }
      _xifexpression = _xblockexpression;
    } else {
      boolean _xifexpression_1 = false;
      if ((fieldExpr instanceof FieldReference)) {
        EList<TwitterFieldDeclaration> _fields = objectType.getFields();
        final Function1<TwitterFieldDeclaration, Boolean> _function = (TwitterFieldDeclaration it) -> {
          TwitterFieldDeclaration _fieldDeclaration = ((FieldReference)fieldExpr).getFieldDeclaration();
          return Boolean.valueOf(Objects.equal(it, _fieldDeclaration));
        };
        _xifexpression_1 = IterableExtensions.<TwitterFieldDeclaration>exists(_fields, _function);
      } else {
        _xifexpression_1 = false;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  /**
   * @returns true, iff the conditions type matches the type of the contained field expression and
   * all fields within the contained field expression exist in the context of the given search type.
   */
  public static boolean checkType(final Condition condition, final TwitterObjectTypeDeclaration searchType) {
    boolean _and = false;
    FieldExpression _fieldExpression = condition.getFieldExpression();
    boolean _fieldExists = Main.fieldExists(_fieldExpression, searchType);
    if (!_fieldExists) {
      _and = false;
    } else {
      boolean _xifexpression = false;
      if ((condition instanceof IntCondition)) {
        FieldExpression _fieldExpression_1 = ((IntCondition)condition).getFieldExpression();
        TwitterFieldDeclaration _fieldDeclaration = Main.fieldDeclaration(_fieldExpression_1);
        Type _type = _fieldDeclaration.getType();
        String _name = _type.getName();
        _xifexpression = Objects.equal(_name, "Integer");
      } else {
        boolean _xifexpression_1 = false;
        if ((condition instanceof BooleanCondition)) {
          FieldExpression _fieldExpression_2 = ((BooleanCondition)condition).getFieldExpression();
          TwitterFieldDeclaration _fieldDeclaration_1 = Main.fieldDeclaration(_fieldExpression_2);
          Type _type_1 = _fieldDeclaration_1.getType();
          String _name_1 = _type_1.getName();
          _xifexpression_1 = Objects.equal(_name_1, "Boolean");
        } else {
          _xifexpression_1 = false;
        }
        _xifexpression = _xifexpression_1;
      }
      _and = _xifexpression;
    }
    return _and;
  }
  
  /**
   * @return true, iff all contained conditions have correct type information within the context of
   * the given search type.
   */
  public static boolean checkTypes(final BooleanExpression expr, final TwitterObjectTypeDeclaration searchType) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (!_matched) {
      if (expr instanceof Not) {
        _matched=true;
        BooleanExpression _operand = ((Not)expr).getOperand();
        _switchResult = Main.checkTypes(_operand, searchType);
      }
    }
    if (!_matched) {
      if (expr instanceof BooleanBinaryOp) {
        _matched=true;
        boolean _and = false;
        BooleanExpression _left = ((BooleanBinaryOp)expr).getLeft();
        boolean _checkTypes = Main.checkTypes(_left, searchType);
        if (!_checkTypes) {
          _and = false;
        } else {
          BooleanExpression _right = ((BooleanBinaryOp)expr).getRight();
          boolean _checkTypes_1 = Main.checkTypes(_right, searchType);
          _and = _checkTypes_1;
        }
        _switchResult = _and;
      }
    }
    if (!_matched) {
      if (expr instanceof Condition) {
        _matched=true;
        _switchResult = Main.checkType(((Condition)expr), searchType);
      }
    }
    if (!_matched) {
      _switchResult = false;
    }
    return _switchResult;
  }
  
  public static void main(final String[] args) {
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
    String _nsURI = TwitterSearchPackage.eINSTANCE.getNsURI();
    EPackage.Registry.INSTANCE.put(_nsURI, TwitterSearchPackage.eINSTANCE);
    final ResourceSetImpl rs = new ResourceSetImpl();
    URI _createFileURI = URI.createFileURI("model/Example.xmi");
    final Resource resource = rs.getResource(_createFileURI, true);
    EList<EObject> _contents = resource.getContents();
    EObject _get = _contents.get(0);
    final Model model = ((Model) _get);
    InputOutput.<String>println("Type checking:");
    EList<Search> _searches = model.getSearches();
    final Consumer<Search> _function = (Search it) -> {
      BooleanExpression _condition = it.getCondition();
      TwitterObjectTypeDeclaration _searchType = it.getSearchType();
      boolean _checkTypes = Main.checkTypes(_condition, _searchType);
      InputOutput.<Boolean>println(Boolean.valueOf(_checkTypes));
    };
    _searches.forEach(_function);
    InputOutput.<String>println("Questions");
    InputOutput.<String>println("Do all searches search for tweets?");
    EList<Search> _searches_1 = model.getSearches();
    final Function1<Search, Boolean> _function_1 = (Search it) -> {
      TwitterObjectTypeDeclaration _searchType = it.getSearchType();
      String _name = _searchType.getName();
      return Boolean.valueOf(Objects.equal(_name, "Tweet"));
    };
    boolean _forall = IterableExtensions.<Search>forall(_searches_1, _function_1);
    InputOutput.<Boolean>println(Boolean.valueOf(_forall));
    InputOutput.<String>println("Does at least one search search for users?");
    EList<Search> _searches_2 = model.getSearches();
    final Function1<Search, TwitterObjectTypeDeclaration> _function_2 = (Search it) -> {
      return it.getSearchType();
    };
    Iterable<TwitterObjectTypeDeclaration> _collect = de.hub.modsoft.twittersearch.main.IterableExtensions.<Search, TwitterObjectTypeDeclaration>collect(_searches_2, _function_2);
    final Function1<TwitterObjectTypeDeclaration, Boolean> _function_3 = (TwitterObjectTypeDeclaration it) -> {
      String _name = it.getName();
      return Boolean.valueOf(Objects.equal(_name, "User"));
    };
    boolean _exists = IterableExtensions.<TwitterObjectTypeDeclaration>exists(_collect, _function_3);
    InputOutput.<Boolean>println(Boolean.valueOf(_exists));
    InputOutput.<String>println("How many different EClasses do all used search types instantiate?");
    EList<Search> _searches_3 = model.getSearches();
    final Function1<Search, EClass> _function_4 = (Search it) -> {
      TwitterObjectTypeDeclaration _searchType = it.getSearchType();
      return _searchType.eClass();
    };
    Iterable<EClass> _collect_1 = de.hub.modsoft.twittersearch.main.IterableExtensions.<Search, EClass>collect(_searches_3, _function_4);
    Set<EClass> _set = IterableExtensions.<EClass>toSet(_collect_1);
    int _size = _set.size();
    InputOutput.<Integer>println(Integer.valueOf(_size));
    InputOutput.<String>println("Is there a search for each object type?");
    Twitter _twitter = model.getTwitter();
    EList<Type> _types = _twitter.getTypes();
    final Function1<Type, Boolean> _function_5 = (Type it) -> {
      return Boolean.valueOf((it instanceof TwitterObjectTypeDeclaration));
    };
    Iterable<Type> _select = de.hub.modsoft.twittersearch.main.IterableExtensions.<Type>select(_types, _function_5);
    final Function1<Type, Boolean> _function_6 = (Type type) -> {
      EList<Search> _searches_4 = model.getSearches();
      final Function1<Search, Boolean> _function_7 = (Search it) -> {
        TwitterObjectTypeDeclaration _searchType = it.getSearchType();
        return Boolean.valueOf(Objects.equal(_searchType, type));
      };
      return Boolean.valueOf(IterableExtensions.<Search>exists(_searches_4, _function_7));
    };
    boolean _forall_1 = IterableExtensions.<Type>forall(_select, _function_6);
    InputOutput.<Boolean>println(Boolean.valueOf(_forall_1));
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("How many conditions does the whole model contain. ");
    _builder.newLine();
    _builder.append("Hints: You can use eAllContents() on all EObjects to get there whole contents as an iterator over EObjects!");
    _builder.newLine();
    _builder.append("You can use toIterable to turn an iterator into an iterable.");
    _builder.newLine();
    _builder.append("All collection functions (collect, select, etc.) only work on iterables.");
    _builder.newLine();
    InputOutput.<String>println(_builder.toString());
    TreeIterator<EObject> _eAllContents = model.eAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents);
    final Function1<EObject, Boolean> _function_7 = (EObject it) -> {
      return Boolean.valueOf((it instanceof Condition));
    };
    Iterable<EObject> _select_1 = de.hub.modsoft.twittersearch.main.IterableExtensions.<EObject>select(_iterable, _function_7);
    int _size_1 = IterableExtensions.size(_select_1);
    InputOutput.<Integer>println(Integer.valueOf(_size_1));
  }
}
