/*
* File: PlantView.java
* Author: Traxler Koppány
* Copyright: 2026, Traxler Koppány
* Group: Szoft II-N
* Date: 2026-01-12
* Github: https://github.com/qtya69/
* Licenc: MIT
*/
package com.example.views;

import com.example.models.Plant;
import java.util.List;

public class PlantView {
    public void printPlants(List<Plant> plants) {
        System.out.println("Mező:  id    | name");
        System.out.println("Típus: int   | string");
        System.out.println("-----------------------");

        for (Plant plant : plants) {
            System.out.printf("       %-5d | %s%n", plant.getId(), plant.getName());
        }
        
        System.out.println("-----------------------");
    }
}