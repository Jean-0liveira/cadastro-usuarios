package com.jean.model;

public class Usuario {

    private String name;
    private String email;

    public Usuario(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public String getEmail(){
        return email;
    }
}
