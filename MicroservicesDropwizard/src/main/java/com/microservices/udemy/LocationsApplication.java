package com.microservices.udemy;

import com.microservices.udemy.api.resources.LocationsResource;
import com.microservices.udemy.business.services.LocationsService;
import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;

public class LocationsApplication extends Application<LocationsConfigurations> {

    @Override
    public void run(LocationsConfigurations configuration, Environment environment) {
        final DBIFactory dbiFactory = new DBIFactory();
        final DBI dbi = dbiFactory.build(environment, configuration.getDataSourceFactory(), "mysql");
        //final UserDAO dao = jdbi.onDemand(UserDAO.class);
        environment.jersey().register(new LocationsResource(new LocationsService()));
        System.out.println("Hello world");
    }

    public static void main(String[] args) throws Exception {
        new LocationsApplication().run(args);
    }
}
