package com.dev.restaurant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Integer price;
    private Integer quantity;
    private Date date;
    private Boolean prepared;
    private Boolean paid;
    private long mealID;
    private long userID;

    public Order() {

    }

    public Order(@JsonProperty("name") String name,
                @JsonProperty("price") Integer price,
                 @JsonProperty("quantity") Integer quantity,
                @JsonProperty("date") Date date,
                 @JsonProperty("prepared") Boolean prepared,
                 @JsonProperty("paid") Boolean paid,
                 @JsonProperty("mealID") long mealID,
                 @JsonProperty("userID") long userID
                ) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.date = date;
        this.prepared = prepared;
        this.paid = paid;
        this.mealID = mealID;
        this.userID = userID;
    }

    public long getId() {
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

    public long getMealID(){
        return mealID;
    }

    public long getUserID(){
        return userID;
    }





}
