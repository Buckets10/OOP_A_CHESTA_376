package com.practicum.system;

public abstract class User {
    private final String name;
    private final String studentID;

    public User(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public abstract void displayInfo();
}