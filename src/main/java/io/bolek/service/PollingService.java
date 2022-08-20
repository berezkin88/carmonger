package io.bolek.service;

import io.smallrye.mutiny.Uni;

import java.io.IOException;
import java.net.URISyntaxException;

public interface PollingService {

    Uni<String> poll() throws URISyntaxException, IOException, InterruptedException;
}
