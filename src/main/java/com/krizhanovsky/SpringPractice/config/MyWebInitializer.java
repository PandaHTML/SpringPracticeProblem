package com.krizhanovsky.SpringPractice.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SessionFactorySpringConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
