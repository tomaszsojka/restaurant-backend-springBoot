package com.dev.restaurant.DTO;

public class AuthenticationResponse {
    private String email;
    private String phoneNumber;
    private Character role;

    public String getEmail() {
        return email;
    }

    public Character getRole() {
        return role;
    }

    public AuthenticationResponse() {
    }

    public AuthenticationResponse(String email, String phoneNumber, Character role) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.role = role;

        System.out.println(email + " , " + phoneNumber);
    }

    @Override
    public String toString() {
        return "AuthenticationResponse{" +
                "email='" + email + '\'' +
                "phoneNumber='" + phoneNumber + '\'' +
                ", role=" + role +
                '}';
    }
}