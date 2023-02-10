package com.example.Library_Management.model;

public class Library {
    private int id;
    private String name;
    private String address;
    private int number;
    private String facility;

    public Library(int id, String name, String address, int number, String facility) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.number = number;
        this.facility = facility;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "LibraryController{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                ", facility='" + facility + '\'' +
                '}';
    }
}
