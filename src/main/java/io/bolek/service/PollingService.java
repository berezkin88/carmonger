package io.bolek.service;

import io.smallrye.mutiny.Uni;

public interface PollingService {

    Uni<String> poll();
}
