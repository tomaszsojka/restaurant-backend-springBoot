package com.dev.restaurant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String phoneNumber;
    private String email;
    private String password;
    private String role;

    public User() {

    }

    public User(/*@JsonProperty("id") UUID id,*/
                @JsonProperty("phoneNumber") String phoneNumber,
                @JsonProperty("email") String email,
                @JsonProperty("password") String password,
                @JsonProperty("role") String role) {
        //this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public long getId() {
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

    public String getRole() {
        return role;
    }
}
