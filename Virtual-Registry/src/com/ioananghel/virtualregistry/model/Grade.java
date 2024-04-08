package com.ioananghel.virtualregistry.model;

public class Grade
{
    private Subject subject;
    private double grade;

    public Grade(Subject subject, double grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public Subject getSubject() {
        return subject;
    }

    public double getGrade() {
        return grade;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
