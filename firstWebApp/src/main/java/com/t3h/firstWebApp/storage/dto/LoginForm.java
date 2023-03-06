package com.t3h.firstWebApp.storage.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LoginForm {
    String username;
    String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
