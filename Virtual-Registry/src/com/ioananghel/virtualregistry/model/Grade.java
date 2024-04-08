package com.ioananghel.virtualregistry.model;

import java.util.List;

public class Grade {
    private String registrationNumber;
    private Subject subject;
    private double grade;

    public Grade(String registrationNumber, Subject subject, double grade) {
        this.registrationNumber = registrationNumber;
        this.subject = subject;
        this.grade = grade;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

}
