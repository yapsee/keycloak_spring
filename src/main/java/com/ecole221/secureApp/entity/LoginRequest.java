package com.ecole221.secureApp.entity;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}
