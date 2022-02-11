package com.github.sbzorro.sbws.infrastructure.configuration;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.github.sbzorro.sbws.resource.Test;

//@Configuration
//@ApplicationPath("/restful")
@Component
public class JerseyConfiguration extends ResourceConfig {
    public JerseyConfiguration() {
    	register(Test.class);
//        property(ServletProperties.FILTER_FORWARD_ON_404, true); 
        }
}
