package com.github.dreamhead.moco.handler.cors;

import com.github.dreamhead.moco.HttpRequest;
import com.github.dreamhead.moco.MutableHttpResponse;

public class CorsCredentialsConfig implements CorsConfig {
    private final boolean allowed;

    public CorsCredentialsConfig(final boolean allowed) {
        this.allowed = allowed;
    }

    @Override
    public final boolean isQualified(final HttpRequest httpRequest) {
        return true;
    }

    @Override
    public final void configure(final MutableHttpResponse httpResponse) {
        httpResponse.addHeader("Access-Control-Allow-Credentials", this.allowed);
    }
}