package io.bolek.service;

import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Singleton
public class PollingServiceImpl implements PollingService {

    @Inject
    HttpClient client;

    @Override
    public Uni<String> poll() throws URISyntaxException, IOException, InterruptedException {
        var request = HttpRequest.newBuilder()
            .uri(new URI("https://auto.ria.com/uk/search/?categories.main.id=1&price.currency=1&price.USD.gte=20000&price.USD.lte=30000&indexName=auto%2Corder_auto%2Cnewauto_search&brand.id%5B0%5D=48&size=20"))
            .GET()
            .build();

        var response = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());

        return Uni.createFrom().future(response).map(HttpResponse::body);
    }
}
