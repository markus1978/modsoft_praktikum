/*
 * generated by Xtext
 */
package de.hub.modsoft.twittersearch.xtext.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import de.hub.modsoft.twittersearch.xtext.ui.internal.TwitterSearchActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class TwitterSearchExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return TwitterSearchActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return TwitterSearchActivator.getInstance().getInjector(TwitterSearchActivator.DE_HUB_MODSOFT_TWITTERSEARCH_XTEXT_TWITTERSEARCH);
	}
	
}
