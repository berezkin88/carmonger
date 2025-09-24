package io.bolek.api;

import io.bolek.service.PollingService;
import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.io.IOException;
import java.net.URISyntaxException;

@Path("/cars")
public class GreetingResource {

    @Inject
    PollingService pollingService;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public Uni<String> hello() throws URISyntaxException, IOException, InterruptedException {
        return pollingService.poll();
    }
}