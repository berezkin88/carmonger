package io.bolek.config;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import java.net.http.HttpClient;

@Dependent
public class CarmongerConfig {

    @Produces
    public HttpClient getClient() {
        return HttpClient.newHttpClient();
    }
}
