package de.hub.modsoft.twittersearch.xtext.generator;

import com.google.common.base.Objects;
import de.hub.modsoft.twittersearch.model.BooleanCondition;
import de.hub.modsoft.twittersearch.model.Condition;
import de.hub.modsoft.twittersearch.model.DistanceUnit;
import de.hub.modsoft.twittersearch.model.IntCondition;
import de.hub.modsoft.twittersearch.model.IntOperators;
import de.hub.modsoft.twittersearch.model.Keywords;
import de.hub.modsoft.twittersearch.model.Location;
import de.hub.modsoft.twittersearch.model.Model;
import de.hub.modsoft.twittersearch.model.Search;
import de.hub.modsoft.twittersearch.model.SearchOption;
import de.hub.modsoft.twittersearch.model.Time;
import de.hub.modsoft.twittersearch.model.TwitterFieldDeclaration;
import de.hub.modsoft.twittersearch.model.TwitterObjectTypeDeclaration;
import de.hub.modsoft.twittersearch.model.TwitterSearchPackage;
import de.hub.modsoft.twittersearch.xtext.TwitterSearchParser;
import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class TwitterSearchGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    EList<EObject> _contents = input.getContents();
    EObject _get = _contents.get(0);
    final Model model = ((Model) _get);
    CharSequence _doGenerate = this.doGenerate(model);
    fsa.generateFile("de/hub/modsoft/twittersearch/RunSearchMain.java", _doGenerate);
  }
  
  public CharSequence doGenerate(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.hub.modsoft.twittersearch;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.json.JSONArray;");
    _builder.newLine();
    _builder.append("import org.json.JSONObject;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import com.mashape.unirest.http.HttpResponse;");
    _builder.newLine();
    _builder.append("import com.mashape.unirest.http.JsonNode;");
    _builder.newLine();
    _builder.append("import com.mashape.unirest.http.Unirest;");
    _builder.newLine();
    _builder.append("import com.mashape.unirest.request.GetRequest;");
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
    TwitterObjectTypeDeclaration _searchType = search.getSearchType();
    String _name = _searchType.getName();
    switch (_name) {
      case "Tweet":
        _switchResult = "search/tweets";
        break;
      case "User":
        _switchResult = "users/search";
        break;
      default:
        throw new RuntimeException("impossible");
    }
    return _switchResult;
  }
  
  protected String _condition(final BooleanCondition condition) {
    TwitterFieldDeclaration _fieldDeclaration = condition.getFieldDeclaration();
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
    TwitterFieldDeclaration _fieldDeclaration = condition.getFieldDeclaration();
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
  
  public CharSequence doGenerateRunSearch(final Search search) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("GetRequest request = Unirest.get(\"http://jupiter.informatik.hu-berlin.de:8080/1.1/");
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
    _builder.append("System.out.println(request.getUrl());");
    _builder.newLine();
    _builder.newLine();
    _builder.append("HttpResponse<JsonNode> response = request.asJson();");
    _builder.newLine();
    _builder.append("if (response.getStatus() != 200) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("System.out.println(\"Something went wrong.\");");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      TwitterObjectTypeDeclaration _searchType = search.getSearchType();
      String _name = _searchType.getName();
      boolean _equals = Objects.equal(_name, "User");
      if (_equals) {
        _builder.append("JSONArray results = response.getBody().getArray();");
        _builder.newLine();
      } else {
        _builder.append("JSONArray results = response.getBody().getObject().getJSONArray(\"statuses\");");
        _builder.newLine();
      }
    }
    _builder.newLine();
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
    {
      TwitterObjectTypeDeclaration _searchType_1 = search.getSearchType();
      String _name_1 = _searchType_1.getName();
      boolean _equals_1 = Objects.equal(_name_1, "User");
      if (_equals_1) {
        _builder.append("\t\t");
        _builder.append("System.out.print(result.getString(\"name\") + \": \");");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("System.out.println(\"\\\"\" + result.getString(\"screen_name\") + \"\\\"\");");
        _builder.newLine();
      } else {
        _builder.append("\t\t");
        _builder.append("System.out.print(result.getJSONObject(\"user\").getString(\"name\") + \": \");");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("System.out.println(\"\\\"\" + result.getString(\"text\") + \"\\\"\");\t\t\t\t");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("if (count++ >= 3) break;\t\t\t\t");
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
      final TwitterSearchParser parser = new TwitterSearchParser();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("twitter {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("primitive Integer");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("primitive Boolean");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("object Tweet {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("field retweet_count : Integer");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("field hasImage : Boolean");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("field hasURL : Boolean");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("object User {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("field favourites_count : Integer");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("field followers_count : Integer");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("field friends_count : Integer");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("searches {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("search for Tweet with \"VW\" where retweet_count > 5 & hasURL");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("search for Tweet with \"quake\" in geo(37.781157,-122.398720,100mi) where hasImage");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("search for User with \"Donald\" before 11.07.2016 where followers_count > 10");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      EObject _parser = parser.parser(_builder.toString());
      final Model model = ((Model) _parser);
      final TwitterSearchGenerator generator = new TwitterSearchGenerator();
      final CharSequence code = generator.doGenerate(model);
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
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(condition).toString());
    }
  }
}
