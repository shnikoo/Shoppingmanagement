package com.example.shoppingmanagement;

public class Data {
    public String name;
    public String username;
    public String password;
    public String phone;

    public Data(){

    }
    public Data(String name,String username,String password,String phone){
        this.name = name;
        this.username = username;
        this.password = password;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
