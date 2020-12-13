package com.company;


public class City {
    private String size;
    private String age;

    public City(String size, String age) {
        this.size = size;
        this.age = age;
    }

    public boolean check_size(String size) {
        return this.size.equals(size);
    }

    public boolean check_age(String age) {
        return this.age.equals(age);
    }
}
