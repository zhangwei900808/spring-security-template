package com.spring.security.dto;

import com.fasterxml.jackson.annotation.JsonView;

public class User {
    private String username;
    private String password;

    public interface UserSimpleView {
    }

    public interface UserDetailView extends UserSimpleView {
    }

    @JsonView(UserSimpleView.class)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @JsonView(UserDetailView.class)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
