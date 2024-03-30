package com.ioananghel.virtualregistry;

public class Subject
{
    private String name;
    private int yearOfStudies;
    private int numberOfCredits;

    public Subject(String name, int yearOfStudies, int numberOfCredits)
    {
        this.name = name;
        this.yearOfStudies = yearOfStudies;
        this.numberOfCredits = numberOfCredits;
    }

    public String getName()
    {
        return name;
    }
    public int getYearOfStudies()
    {
        return yearOfStudies;
    }
    public int getNumberOfCredits()
    {
        return numberOfCredits;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setYearOfStudies(int yearOfStudies)
    {
        this.yearOfStudies = yearOfStudies;
    }

    public void setNumberOfCredits(int numberOfCredits)
    {
        this.numberOfCredits = numberOfCredits;
    }
}
