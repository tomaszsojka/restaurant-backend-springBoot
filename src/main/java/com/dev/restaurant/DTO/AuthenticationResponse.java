package com.dev.restaurant.DTO;

public class AuthenticationResponse {
    private String email;
    private Character role;

    public String getEmail() {
        return email;
    }

    public Character getRole() {
        return role;
    }

    public AuthenticationResponse() {
    }

    public AuthenticationResponse(String email, Character role) {
        this.email = email;
        this.role = role;
    }

    @Override
    public String toString() {
        return "AuthenticationResponse{" +
                "email='" + email + '\'' +
                ", role=" + role +
                '}';
    }
}