package io.bolek.service;

import io.smallrye.mutiny.Uni;

import javax.inject.Singleton;

@Singleton
public class PollingServiceImpl implements PollingService {

    @Override
    public Uni<String> poll() {
        return Uni.createFrom().item("{\"message\": \"Test message\"}");
    }
}
