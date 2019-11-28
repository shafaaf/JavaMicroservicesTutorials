package com.microservices.udemy;

import com.microservices.udemy.api.resources.LocationsResource;
import com.microservices.udemy.business.services.LocationsService;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

public class LocationsApplication extends Application<Configuration> {

    @Override
    public void run(Configuration configuration, Environment environment) {
        environment.jersey().register(new LocationsResource(new LocationsService()));
        System.out.println("Hello world");
    }

    public static void main(String[] args) throws Exception {
        new LocationsApplication().run(args);
    }
}
