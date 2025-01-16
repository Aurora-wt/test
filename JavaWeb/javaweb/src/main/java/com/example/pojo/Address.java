package com.example.pojo;

import lombok.Data;

@Data
public class Address {
    private String province;
    private String city;
    public Address(){}
    public Address(String province, String city) {
        this.province = province;
        this.city = city;
    }
}
