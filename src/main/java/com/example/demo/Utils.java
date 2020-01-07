package com.example.demo;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public final class Utils {

    private Utils() {
    }

    public static HttpResponse<JsonNode> httpGet(String url){
        HttpResponse<JsonNode> result = null;
        CompletableFuture<HttpResponse<JsonNode>> future = Unirest.get(url)
                .header("accept", "application/json")
                .asJsonAsync(response -> {
                    int code = response.getStatus();
                    JsonNode body = response.getBody();
                });
        try {
            JsonNode body = future.get().getBody();
            int code = future.get().getStatus();
            result = future.get();
        } catch (InterruptedException ie) {
            //
        } catch (ExecutionException ee) {
            //
        }
        return result;
    }
}
