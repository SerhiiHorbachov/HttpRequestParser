package com.example;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientDemo {

    private final static String URL = "https://jsonplaceholder.typicode.com/albums";

    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        parse(response.body());


    }

    public static void parse(String responseBody) {
        JSONArray albums = new JSONArray(responseBody);
        for (int i = 0; i < albums.length(); i++) {
            JSONObject album = albums.getJSONObject(i);

            int id = album.getInt("id");
            int userId = album.getInt("userId");
            String title = album.getString("title");
            System.out.println(album);
        }
    }
}
