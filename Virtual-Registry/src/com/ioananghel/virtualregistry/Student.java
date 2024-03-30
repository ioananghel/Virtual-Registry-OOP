package com.ioananghel.virtualregistry;

import java.util.List;

public class Student extends Person
{
    private String registrationNumber;
    private int yearOfStudies;
    private double gradeAverage;
    private List<Subject> currentlyAttending;
    private List<Grade> grades;

    public Student(String name, String surname, String cnp, String address, String phoneNumber,
                   String registrationNumber, int yearOfStudies, double gradeAverage,
                   List<Subject> currentlyAttending, List<Grade> grades)
    {
        super(name, surname, cnp, address, phoneNumber);
        this.registrationNumber = registrationNumber;
        this.yearOfStudies = yearOfStudies;
        this.gradeAverage = gradeAverage;
        this.currentlyAttending = currentlyAttending;
        this.grades = grades;
    }

    @Override
    public String getInfo()
    {
        return "Student: " + getName() + ", Address: " + getAddress() + ", Phone Number: " + getPhoneNumber();
    }
    public String getRegistrationNumber()
    {
        return registrationNumber;
    }

    public int getYearOfStudies()
    {
        return yearOfStudies;
    }

    public double getGradeAverage()
    {
        return gradeAverage;
    }

    public List<Subject> getCurrentlyAttending()
    {
        return currentlyAttending;
    }

    public List<Grade> getGrades()
    {
        return grades;
    }

    public void setRegistrationNumber(String registrationNumber)
    {
        this.registrationNumber = registrationNumber;
    }

    public void setYearOfStudies(int yearOfStudies)
    {
        this.yearOfStudies = yearOfStudies;
    }

    public void setGradeAverage(double gradeAverage)
    {
        this.gradeAverage = gradeAverage;
    }

    public void setCurrentlyAttending(List<Subject> currentlyAttending)
    {
        this.currentlyAttending = currentlyAttending;
    }

    public void setGrades(List<Grade> grades)
    {
        this.grades = grades;
    }

    @Override
    public String getAllInfo()
    {
        return super.getAllInfo() + ", " + getRegistrationNumber() + ", " + getYearOfStudies() + ", " + getGradeAverage() + ", " + getCurrentlyAttending() + ", " + getGrades();
    }

    @Override
    public String getQualification()
    {
        return "Student";
    }

    public void addGrade(Grade grade)
    {
        this.grades.add(grade);
    }
}
