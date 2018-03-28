package com.start.wenda.model;

public class User {
    private String name;
    private String password;
    private String headUrl;

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription(){
        return "This is " + name;
    }
}
