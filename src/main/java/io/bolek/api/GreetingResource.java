package io.bolek.api;

import io.bolek.service.PollingService;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    PollingService pollingService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<String> hello() {
        return pollingService.poll();
    }
}