package com.example.uitsonlinelibrary;

public class Student {

    String email,password,name,id,mobile;

    public Student() {

    }

    public Student(String email, String password, String name, String id, String mobile) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.id = id;
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
