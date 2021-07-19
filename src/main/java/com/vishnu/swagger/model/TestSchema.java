package com.vishnu.swagger.model;

public class TestSchema {

    private String name;

    private String place;

    private String test;

    public TestSchema() {
    }

    public TestSchema(String name, String place, String test) {
        this.name = name;
        this.place = place;
        this.test = test;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "TestSchema{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", test='" + test + '\'' +
                '}';
    }
}
