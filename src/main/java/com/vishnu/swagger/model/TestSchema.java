package com.vishnu.swagger.model;

public class TestSchema {

    private String name;

    private String place;

    private String test;
    
    private String aa;

    public TestSchema() {
    }

    public TestSchema(String name, String place, String test,String aa) {
        this.name = name;
        this.place = place;
        this.test = test;
        this.aa=aa;
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
    
     public String getAa() {
        return aa;
    }

    public void setName(String aa) {
        this.aa = aa;
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
