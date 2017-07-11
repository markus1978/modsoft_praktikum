package de.hub.modsoft.twittersearch.xtext.generator;

import de.hub.modsoft.twittersearch.model.Model;
import de.hub.modsoft.twittersearch.model.TwitterSearchPackage;
import de.hub.modsoft.twittersearch.xtext.TwitterSearchParser;
import java.io.File;
import java.util.function.Consumer;
import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

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
    _builder.append("\t\t");
    _builder.append("// TODO");
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
      _builder.append("search for Tweet with \"VW\" before 12.07.2017 where retweet_count > 5 & hasURL;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("search for Tweet with \"quake\" in geo(37.781157,-122.398720,100mi) where hasImage;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("search for User with \"Donald\" where followers_count > 10;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      EObject _parser = parser.parser(_builder.toString());
      final Model model = ((Model) _parser);
      Resource _eResource = model.eResource();
      EList<Resource.Diagnostic> _errors = _eResource.getErrors();
      final Consumer<Resource.Diagnostic> _function = (Resource.Diagnostic it) -> {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("ERROR: ");
        _builder_1.append(it, "");
        InputOutput.<String>println(_builder_1.toString());
      };
      _errors.forEach(_function);
      final TwitterSearchGenerator generator = new TwitterSearchGenerator();
      final CharSequence code = generator.doGenerate(model);
      File _file = new File("src-gen/de/hub/modsoft/twittersearch/RunSearchMain.java");
      FileUtils.write(_file, code);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
