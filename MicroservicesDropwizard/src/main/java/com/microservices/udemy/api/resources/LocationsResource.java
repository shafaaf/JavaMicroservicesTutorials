package com.microservices.udemy.api.resources;

import com.microservices.udemy.business.services.LocationsService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/v1/locations")
@Consumes(MediaType.APPLICATION_JSON+"; charset=utf-8")
@Produces(MediaType.APPLICATION_JSON)
public class LocationsResource {

    private LocationsService locationsService;

    public LocationsResource(final LocationsService locationsService) {
        this.locationsService = locationsService;
    }

    // get all locations from DB
    @GET
    public Response getLocations() {
        return Response.ok().entity("id:").build();
    }
}
