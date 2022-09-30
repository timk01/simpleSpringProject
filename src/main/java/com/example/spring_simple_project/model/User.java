package com.example.spring_simple_project.model;

public class User {
    private int id;
    private String fio;
    private int age;
    private String email;

    public User() {

    }

    public User(int id, String fio, int age, String email) {
        this.id = id;
        this.fio = fio;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
