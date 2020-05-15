package com.dev.restaurant.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Dish {
    private final UUID id;
    private final String name;
    private final String description;
    private final int price;

    public Dish(@JsonProperty("id") UUID id,
                @JsonProperty("name") String name,
                @JsonProperty("description") String description,
                @JsonProperty("price") int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}
