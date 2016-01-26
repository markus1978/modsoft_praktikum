package de.hub.modsoft.twittersearch.codegen;

import de.hub.modsoft.twittersearch.model.Search;
import de.hub.modsoft.twittersearch.model.Twitter;
import de.hub.modsoft.twittersearch.model.TwitterSearchPackage;
import java.io.File;
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
  
  public CharSequence doGenerateRunSearch(final Search search) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// TODO");
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
}
