package com.course.structure;

public class Building {
    private String name;
    private String address;

    public Building(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters and setters (if needed)

    @Override
    public String toString() {
        return "Building: " + name + "\nAddress: " + address;
    }
}
