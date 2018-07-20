package com.example.student.mynewapp;

/**
 * Created by Student on 7/20/2018.
 */

public class Product {
    private int imageId;
    private String name;
    private String specs;

    public Product(int imageId, String name, String specs) {
        this.imageId = imageId;
        this.name = name;
        this.specs = specs;
    }

    public int getImageId() {
        return imageId;
    }

    public String getName() {
        return name;
    }

    public String getSpecs() {
        return specs;
    }
}
