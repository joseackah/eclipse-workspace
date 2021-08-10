package com.security.spring.javaConfiguration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;

public class AppIntializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		
		AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();
		root.register(SecSecurityConfig.class);
		sc.addListener(new ContextLoaderListener(root));
		sc.addFilter("securityFilter", new DelegatingFilterProxy("springSecurityFilterChain")).addMappingForUrlPatterns(null, false, "/*" );
		
		
		
		
	}

}
