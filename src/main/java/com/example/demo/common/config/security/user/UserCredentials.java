package com.example.demo.common.config.security.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserCredentials {
    String email;
    String password;
}
