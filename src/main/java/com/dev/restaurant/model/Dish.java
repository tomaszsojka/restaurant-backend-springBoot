package com.dev.restaurant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "dishes")
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private int price;
    private String type;

    Dish() {

    }

    public Dish(@JsonProperty("name") String name,
                @JsonProperty("description") String description,
                @JsonProperty("price") int price,
                @JsonProperty("type") String type) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.type = type;
    }

    public long getId() {
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

    public String getType() {
        return type;
    }
}
