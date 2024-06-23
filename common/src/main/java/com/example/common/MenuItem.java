package com.example.common;

public class MenuItem {
    private String ImageUrl;
    private String name;

    public MenuItem() {
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public MenuItem setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
        return this;
    }

    public String getName() {
        return name;
    }

    public MenuItem setName(String name) {
        this.name = name;
        return this;
    }
}
