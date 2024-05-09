package com.app.belikan;

public class Fish {
    private String name;
    private String price;
    private String rating;
    private int imageResource;
    private boolean isFavorite;

    public Fish(String name, String price, String rating, int imageResource, boolean isFavorite) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.imageResource = imageResource;
        this.isFavorite = isFavorite;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getRating() {
        return rating;
    }

    public int getImageResource() {
        return imageResource;
    }

    public boolean isFavorite() {
        return isFavorite;
    }
}
