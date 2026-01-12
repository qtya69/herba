/*
* File: PlantController.java
* Author: Traxler Koppány
* Copyright: 2026, Traxler Koppány
* Group: Szoft II-N
* Date: 2026-01-12
* Github: https://github.com/qtya69/
* Licenc: MIT
*/
package com.example.controllers;
import com.google.gson.Gson;

import com.example.models.Plant;
import com.example.models.PlantResponse;
import com.example.views.PlantView;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class PlantController {
    private PlantView view;

    public PlantController() {
        this.view = new PlantView();
    }

    public void start() {
        try {
            // A backend kódod alapján a helyes URL:
            String url = "http://localhost:8000/api/herbs";
            
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                Gson gson = new Gson();
                
                PlantResponse responseObj = gson.fromJson(response.body(), PlantResponse.class);
                
                List<Plant> plants = responseObj.getData();

                view.printPlants(plants);
            } else {
                System.out.println("Hiba történt! Státuszkód: " + response.statusCode());
            }

        } catch (Exception e) {
            System.out.println("Hiba történt: " + e.getMessage());
        }
    }
}