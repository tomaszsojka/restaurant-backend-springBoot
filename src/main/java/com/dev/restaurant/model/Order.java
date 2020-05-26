package com.dev.restaurant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Date;
import java.util.UUID;

public class Order {
    private final UUID id;
    private final String name;
    private final Integer price;
    private final Integer quantity;
    private final Date date;
    private final Boolean prepared;
    private final Boolean paid;
    private final String mealID;
    private final Integer userID;

    public Order(@JsonProperty("id") UUID id,
                @JsonProperty("name") String name,
                @JsonProperty("price") Integer price,
                 @JsonProperty("quantity") Integer quantity,
                @JsonProperty("date") Date date,
                 @JsonProperty("prepared") Boolean prepared,
                 @JsonProperty("paid") Boolean paid,
                 @JsonProperty("mealID") String mealID,
                 @JsonProperty("userID") Integer userID

                ) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.date = date;
        this.prepared = prepared;
        this.paid = paid;
        this.mealID = mealID;
        this.userID = userID;
    }

    public UUID getId() {
        return id;
    }

    public Integer getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public Date getDate(){
        return date;
    }

    public Boolean getPrepared(){
        return prepared;
    }

    public Boolean getPaid(){
        return paid;
    }

    public String getMealID(){
        return mealID;
    }

    public Integer getUserID(){
        return userID;
    }





}
