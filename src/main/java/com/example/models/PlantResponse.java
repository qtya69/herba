/*
* File: PlantResponse.java
* Author: Traxler Koppány
* Copyright: 2026, Traxler Koppány
* Group: Szoft II-N
* Date: 2026-01-12
* Github: https://github.com/qtya69/
* Licenc: MIT
*/
package com.example.models;

import java.util.List;

public class PlantResponse {
    private boolean success;
    private List<Plant> data;

    public boolean isSuccess() {
        return success;
    }

    public List<Plant> getData() {
        return data;
    }

    public void setData(List<Plant> data) {
        this.data = data;
    }
}