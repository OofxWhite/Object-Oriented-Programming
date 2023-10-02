package com.course.structure;

public class House extends Building {
    private int numberOfBedrooms;

    public House(String name, String address, int numberOfBedrooms) {
        super(name, address);
        this.numberOfBedrooms = numberOfBedrooms;
    }

    // Getters and setters (if needed)

    @Override
    public String toString() {
        return super.toString() + "\nNumber of Bedrooms: " + numberOfBedrooms;
    }
}
