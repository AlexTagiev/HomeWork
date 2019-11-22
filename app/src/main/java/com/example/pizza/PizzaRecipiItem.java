package com.example.pizza;

import java.sql.Struct;

public class PizzaRecipiItem {

    private int imageResource;
    private String title;
    private String description;
    private String recipe;

    public PizzaRecipiItem(int imageResource, String title, String description, String recipe) {
        this.imageResource = imageResource;
        this.title = title;
        this.description = description;
        this.recipe = recipe;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
    public String getRecipe() {
        return recipe;
    }
}
