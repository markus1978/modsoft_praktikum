package de.hub.modsoft.twittersearch.xtext;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class TwitterSearchParser {
	 
    @Inject
    private XtextResourceSet resourceSet;
 
    public TwitterSearchParser() {
        setupParser();
    }
 
    private void setupParser() {
        new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
        Injector injector = new TwitterSearchStandaloneSetup().createInjectorAndDoEMFRegistration();
        injector.injectMembers(this);
        resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
    }
 
    public EObject parse(InputStream in) throws IOException {
        Resource resource = resourceSet.createResource(URI.createURI("dummy:/inmemory.ts"));
        resource.load(in, resourceSet.getLoadOptions());
        return resource.getContents().get(0);
    }
 
    public EObject parser(String text) throws IOException {
    	return parse(new ByteArrayInputStream(text.getBytes()));
    }
}