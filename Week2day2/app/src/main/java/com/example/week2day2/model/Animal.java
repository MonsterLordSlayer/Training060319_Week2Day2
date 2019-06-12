package com.example.week2day2.model;

public class Animal {
    private String name;
    private String categrory;
    private String description;

    public Animal(String name, String categrory, String description) {
        this.name = name;
        this.categrory = categrory;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getCategrory() {
        return categrory;
    }

    public String getDescription() {
        return description;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCategrory(String categrory) {
        this.categrory = categrory;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
