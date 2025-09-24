package io.bolek.config;

import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Default;
import jakarta.enterprise.inject.Produces;

import java.net.http.HttpClient;

@Dependent
public class CarmongerConfig {

    @Produces
    public HttpClient getClient() {
        return HttpClient.newHttpClient();
    }
}
