package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class java2 {
    public static void main(String[] args) throws IOException, InterruptedException {

        String url = "https://api.weatherbit.io/v2.0/current?lat=35.7796&lon=-78.6382&key=de2988152aca45dd8be9a33881d21bf6&include=minutely";

        //building request
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        //creating object
        HttpClient httpClient = HttpClient.newBuilder().build();

        HttpResponse<String> httpResponse = httpClient.send(request,HttpResponse.BodyHandlers.ofString());

        System.out.println(httpResponse.statusCode());
        System.out.println(httpResponse.body());
    }
}