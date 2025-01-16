package com.example.pojo;

import lombok.Data;

@Data
public class Emp {
    private String name;
    private Integer age;
    private String image;
    private String gender;
    private String job;
    public Emp() {}
    public Emp(String name, Integer age, String image, String gender, String job) {
        this.name = name;
        this.age = age;
        this.image = image;
        this.gender = gender;
        this.job = job;
    }
}
