package com.example.socialnetwork.model;

public class Response {
    private boolean successful;

    public Response(boolean successful) {
        this.successful = successful;
    }

    public boolean isSuccessful() {
        return successful;
    }
}
