package de.hub.modsoft.twittersearch.main;

import de.hub.modsoft.twittersearch.BooleanBinaryOp;
import de.hub.modsoft.twittersearch.BooleanExpression;
import de.hub.modsoft.twittersearch.Condition;
import de.hub.modsoft.twittersearch.Dot;
import de.hub.modsoft.twittersearch.FieldExpression;
import de.hub.modsoft.twittersearch.FieldReference;
import de.hub.modsoft.twittersearch.Model;
import de.hub.modsoft.twittersearch.Not;
import de.hub.modsoft.twittersearch.Search;
import de.hub.modsoft.twittersearch.TwitterFieldDeclaration;
import de.hub.modsoft.twittersearch.TwitterObjectTypeDeclaration;
import de.hub.modsoft.twittersearch.TwitterSearchPackage;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Main {
  /**
   * @returns the field declaration that is represented by the given field expression.
   */
  public static TwitterFieldDeclaration fieldDeclaration(final FieldExpression fieldExpr) {
    if ((fieldExpr instanceof FieldReference)) {
      return null;
    } else {
      if ((fieldExpr instanceof Dot)) {
        return null;
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
      _xifexpression = false;
    } else {
      boolean _xifexpression_1 = false;
      if ((fieldExpr instanceof FieldReference)) {
        _xifexpression_1 = false;
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
    return false;
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
        _switchResult = false;
      }
    }
    if (!_matched) {
      if (expr instanceof BooleanBinaryOp) {
        _matched=true;
        _switchResult = false;
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
    InputOutput.<String>println("TODO");
    InputOutput.<String>println("Does at least one search search for users?");
    InputOutput.<String>println("TODO");
    InputOutput.<String>println("How many different EClasses do all used search types instantiate?");
    InputOutput.<String>println("TODO");
    InputOutput.<String>println("Is there a search for each object type?");
    InputOutput.<String>println("TODO");
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
    InputOutput.<String>println("TODO");
  }
}
