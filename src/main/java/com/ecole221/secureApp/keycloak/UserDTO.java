package com.ecole221.secureApp.keycloak;

import lombok.Data;

import java.util.List;

@Data
public class UserDTO {

    private String username;
    private String password;
    private String prenom;
    private String nom;
    private String email;
    private List<String> roles;
}
