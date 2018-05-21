package com.example.rezafd.myapplication;

public class login {

    String username,pass;

    public login(String username, String pass) {
        this.username = username;
        this.pass = pass;
    }

    public login() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
