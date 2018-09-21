package com.opensource.dada.java9;

import java.io.IOException;
import java.net.Authenticator;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpClientExample {
    public static void main(String[] args) {
        System.out.println("Hello " + HttpClientExample.class.getSimpleName());

        HttpRequest request = null;
        try {
            HttpClient client = HttpClient.newBuilder()
                            .version(HttpClient.Version.HTTP_2)
                            .followRedirects(HttpClient.Redirect.NORMAL)
                            .connectTimeout(Duration.ofSeconds(20))
                            .build();

            request = HttpRequest.newBuilder()
                    .uri(new URI("https://postman-echo.com/get"))
                    .GET()
                    .timeout(Duration.ofSeconds(30))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Sync HttpResponse: ");
            System.out.println(response.body());

            System.out.println("Async HttpResponse: ");
    client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                            .thenApply(HttpResponse::body)
                            .thenAccept(System.out::println);

        } catch (URISyntaxException | IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}
