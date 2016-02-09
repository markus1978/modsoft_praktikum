package de.hub.modsoft.twittersearch.codegen;

import de.hub.modsoft.twittersearch.model.BooleanCondition;
import de.hub.modsoft.twittersearch.model.Condition;
import de.hub.modsoft.twittersearch.model.DistanceUnit;
import de.hub.modsoft.twittersearch.model.FieldDeclaration;
import de.hub.modsoft.twittersearch.model.FieldExpr;
import de.hub.modsoft.twittersearch.model.IntCondition;
import de.hub.modsoft.twittersearch.model.IntOperators;
import de.hub.modsoft.twittersearch.model.Keywords;
import de.hub.modsoft.twittersearch.model.Location;
import de.hub.modsoft.twittersearch.model.Search;
import de.hub.modsoft.twittersearch.model.SearchOption;
import de.hub.modsoft.twittersearch.model.StringCondition;
import de.hub.modsoft.twittersearch.model.StringOperators;
import de.hub.modsoft.twittersearch.model.Time;
import de.hub.modsoft.twittersearch.model.Twitter;
import de.hub.modsoft.twittersearch.model.TwitterObjectType;
import de.hub.modsoft.twittersearch.model.TwitterSearchPackage;
import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class CodeGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    EList<EObject> _contents = input.getContents();
    EObject _get = _contents.get(0);
    final Twitter model = ((Twitter) _get);
    CharSequence _doGenerate = this.doGenerate(model);
    fsa.generateFile("de/hub/modsoft/twittersearch/RunSearchMain.java", _doGenerate);
  }
  
  public CharSequence doGenerate(final Twitter model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.hub.modsoft.twittersearch;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class RunSearchMain {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) throws Exception {");
    _builder.newLine();
    {
      EList<Search> _searches = model.getSearches();
      for(final Search search : _searches) {
        _builder.append("\t\t");
        _builder.append("{\t\t\t\t\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        CharSequence _doGenerateRunSearch = this.doGenerateRunSearch(search);
        _builder.append(_doGenerateRunSearch, "\t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected Pair<String, String> _parameter(final Keywords option) {
    EList<String> _keywords = option.getKeywords();
    final Function1<String, String> _function = (String it) -> {
      int _length = it.length();
      int _minus = (_length - 1);
      return it.substring(1, _minus);
    };
    List<String> _map = ListExtensions.<String, String>map(_keywords, _function);
    String _join = IterableExtensions.join(_map, " ");
    return Pair.<String, String>of("q", _join);
  }
  
  protected Pair<String, String> _parameter(final Location option) {
    final DecimalFormat format = new DecimalFormat("#.000000");
    StringConcatenation _builder = new StringConcatenation();
    double _lon = option.getLon();
    String _format = format.format(_lon);
    _builder.append(_format, "");
    _builder.append(",");
    double _lat = option.getLat();
    String _format_1 = format.format(_lat);
    _builder.append(_format_1, "");
    _builder.append(",");
    double _radius = option.getRadius();
    _builder.append(((int) _radius), "");
    DistanceUnit _radiusUnit = option.getRadiusUnit();
    _builder.append(_radiusUnit, "");
    return Pair.<String, String>of("geocode", _builder.toString());
  }
  
  protected Pair<String, String> _parameter(final Time option) {
    StringConcatenation _builder = new StringConcatenation();
    SimpleDateFormat _simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD");
    Date _before = option.getBefore();
    String _format = _simpleDateFormat.format(_before);
    _builder.append(_format, "");
    return Pair.<String, String>of("before", _builder.toString());
  }
  
  public String uri(final Search search) {
    String _switchResult = null;
    TwitterObjectType _searchFor = search.getSearchFor();
    String _name = _searchFor.getName();
    switch (_name) {
      case "tweet":
        _switchResult = "search/tweets";
        break;
      case "user":
        _switchResult = "tweets/users";
        break;
      default:
        throw new RuntimeException("impossible");
    }
    return _switchResult;
  }
  
  public String jsonKey(final Search search) {
    String _switchResult = null;
    TwitterObjectType _searchFor = search.getSearchFor();
    String _name = _searchFor.getName();
    switch (_name) {
      case "tweet":
        _switchResult = "statuses";
        break;
      case "user":
        _switchResult = "users";
        break;
      default:
        throw new RuntimeException("impossible");
    }
    return _switchResult;
  }
  
  protected String _condition(final BooleanCondition condition) {
    FieldExpr _field = condition.getField();
    FieldDeclaration _fieldDeclaration = _field.getFieldDeclaration();
    String _name = _fieldDeclaration.getName();
    String _substring = _name.substring(3);
    String _lowerCase = _substring.toLowerCase();
    final String entity = (_lowerCase + "s");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("result.getJSONObject(\"entities\").getJSONArray(\"");
    _builder.append(entity, "");
    _builder.append("\").length() > 0");
    return _builder.toString();
  }
  
  public String intOperator(final IntOperators op) {
    String _switchResult = null;
    if (op != null) {
      switch (op) {
        case EQ:
          _switchResult = "==";
          break;
        case GEQ:
          _switchResult = ">=";
          break;
        case LEQ:
          _switchResult = "<=";
          break;
        case GT:
          _switchResult = ">";
          break;
        case LT:
          _switchResult = "<";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  protected String _condition(final IntCondition condition) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("result.getInt(\"");
    FieldExpr _field = condition.getField();
    FieldDeclaration _fieldDeclaration = _field.getFieldDeclaration();
    String _name = _fieldDeclaration.getName();
    _builder.append(_name, "");
    _builder.append("\") ");
    IntOperators _operator = condition.getOperator();
    String _intOperator = this.intOperator(_operator);
    _builder.append(_intOperator, "");
    _builder.append(" ");
    int _operand = condition.getOperand();
    _builder.append(_operand, "");
    return _builder.toString();
  }
  
  protected String _condition(final StringCondition condition) {
    String _switchResult = null;
    StringOperators _operator = condition.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case CONTAINS:
          _switchResult = "";
          break;
        case CONTAINSNOT:
          _switchResult = "!";
          break;
        default:
          break;
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("result.getString(\"");
    FieldExpr _field = condition.getField();
    FieldDeclaration _fieldDeclaration = _field.getFieldDeclaration();
    String _name = _fieldDeclaration.getName();
    _builder.append(_name, "");
    _builder.append("\").toLowerCase().contains(");
    String _operand = condition.getOperand();
    String _lowerCase = _operand.toLowerCase();
    _builder.append(_lowerCase, "");
    _builder.append(")");
    return (_switchResult + _builder);
  }
  
  public CharSequence doGenerateRunSearch(final Search search) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("GetRequest request = Unirest.get(\"http://localhost:8080/1.1/");
    String _uri = this.uri(search);
    _builder.append(_uri, "");
    _builder.append(".json\");");
    _builder.newLineIfNotEmpty();
    _builder.append("request.queryString(\"count\", \"100\");");
    _builder.newLine();
    {
      EList<SearchOption> _options = search.getOptions();
      final Function1<SearchOption, Pair<String, String>> _function = (SearchOption it) -> {
        return this.parameter(it);
      };
      List<Pair<String, String>> _map = ListExtensions.<SearchOption, Pair<String, String>>map(_options, _function);
      for(final Pair<String, String> option : _map) {
        _builder.append("request.queryString(\"");
        String _key = option.getKey();
        _builder.append(_key, "");
        _builder.append("\", \"");
        String _value = option.getValue();
        _builder.append(_value, "");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("println(request.getUrl());");
    _builder.newLine();
    _builder.newLine();
    _builder.append("HttpResponse<JsonNode> response = request.asJson();");
    _builder.newLine();
    _builder.append("if (response.getStatus() != 200) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("println(\"Something went wrong.\");");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("JSONArray results = response.getBody().getObject().getJSONArray(\"");
    String _jsonKey = this.jsonKey(search);
    _builder.append(_jsonKey, "");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("int count = 0;");
    _builder.newLine();
    _builder.append("for (int i = 0; i < results.length(); i++) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("JSONObject result = results.getJSONObject(i);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("boolean fulfilsConditions = true;");
    _builder.newLine();
    {
      EList<Condition> _conditions = search.getConditions();
      for(final Condition condition : _conditions) {
        _builder.append("\t");
        _builder.append("fulfilsConditions &= ");
        String _condition = this.condition(condition);
        _builder.append(_condition, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("if (fulfilsConditions) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.print(result.getJSONObject(\"user\").getString(\"name\") + \": \");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println(\"\\\"\" + result.getString(\"text\") + \"\\\"\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (count++ >= 3) break;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static void main(final String[] args) {
    try {
      String _nsURI = TwitterSearchPackage.eINSTANCE.getNsURI();
      EPackage.Registry.INSTANCE.put(_nsURI, TwitterSearchPackage.eINSTANCE);
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
      final ResourceSetImpl rs = new ResourceSetImpl();
      URI _createURI = URI.createURI("model/Examples.xmi");
      final Resource resource = rs.getResource(_createURI, true);
      final CodeGenerator generator = new CodeGenerator();
      EList<EObject> _contents = resource.getContents();
      EObject _get = _contents.get(0);
      final CharSequence code = generator.doGenerate(((Twitter) _get));
      File _file = new File("src-gen/de/hub/modsoft/twittersearch/RunSearchMain.java");
      FileUtils.write(_file, code);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Pair<String, String> parameter(final SearchOption option) {
    if (option instanceof Keywords) {
      return _parameter((Keywords)option);
    } else if (option instanceof Location) {
      return _parameter((Location)option);
    } else if (option instanceof Time) {
      return _parameter((Time)option);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(option).toString());
    }
  }
  
  public String condition(final Condition condition) {
    if (condition instanceof BooleanCondition) {
      return _condition((BooleanCondition)condition);
    } else if (condition instanceof IntCondition) {
      return _condition((IntCondition)condition);
    } else if (condition instanceof StringCondition) {
      return _condition((StringCondition)condition);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(condition).toString());
    }
  }
}
