
package com.hornitosapp.rest.service;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

/**
 *
 * @author ruberr
 */
@ApplicationPath("api")
public class AppConfig extends ResourceConfig{

    public AppConfig() {
         packages("com.hornitosapp.rest.service;com.hornitosapp.rest.auth");
        register(RolesAllowedDynamicFeature.class);
    }
}
