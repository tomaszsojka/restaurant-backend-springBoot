package com.dev.restaurant.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class User {

    private final UUID id;
    private final String phoneNumber;
    private final String email;
    private final String password;
    private final String type;

    public User(@JsonProperty("id") UUID id,
                @JsonProperty("phoneNumber") String phoneNumber,
                @JsonProperty("email") String email,
                @JsonProperty("password") String password,
                @JsonProperty("type") String type) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.type = type;
    }

    public UUID getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getType() {
        return type;
    }
}
