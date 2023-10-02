package com.course.structure;

public class School extends Building {
    private int numberOfClassrooms;

    public School(String name, String address, int numberOfClassrooms) {
        super(name, address);
        this.numberOfClassrooms = numberOfClassrooms;
    }

    // Getters and setters (if needed)

    @Override
    public String toString() {
        return super.toString() + "\nNumber of Classrooms: " + numberOfClassrooms;
    }
}
