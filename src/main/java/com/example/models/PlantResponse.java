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