/*
 * generated by Xtext
 */
package de.hub.modsoft.twittersearch.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TwitterSearchStandaloneSetup extends TwitterSearchStandaloneSetupGenerated{

	public static void doSetup() {
		new TwitterSearchStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

