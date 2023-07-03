package com.example.socialnetwork.model;

import java.util.Map;

public class Request {
    private String endpoint;
    private Map<String, String> headers;
    private String body;

    public Request() {
        this.endpoint = endpoint;
        this.headers = headers;
        this.body = body;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public String getBody() {
        return body;
    }
}