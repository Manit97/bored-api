package com.sparta.ms.boredapi.withFramework;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;

public class ConnectionManager {
    private static final String BASEURL = "https://www.boredapi.com/api";
    private static String endPoint;


    public static String getConnection() {
        return BASEURL + "/activity";
    }

    public static int getStatusCode() {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(BASEURL + endPoint)).build();
        int statusCode = 0;

        try {
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            statusCode = httpResponse.statusCode();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return statusCode;
    }
}
