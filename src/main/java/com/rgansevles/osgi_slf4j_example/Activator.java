package com.rgansevles.osgi_slf4j_example;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Activator implements BundleActivator
{
    private static final Logger log = LoggerFactory.getLogger(Activator.class);
    
	@Override
	public void start(BundleContext context) throws Exception {
		System.err.println("Bundle starting");
		log.info("logging to bundle");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.err.println("Bundle stopping");
	}
}
