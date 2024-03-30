package com.ioananghel.virtualregistry;

import java.util.List;

public class Teacher extends Person
{
    private List<Subject> currentlyTeaching;

    public Teacher(String name, String surname, String cnp,
                   String address, String phoneNumber, List<Subject> currentlyTeaching)
    {
        super(name, surname, cnp, address, phoneNumber);
        this.currentlyTeaching = currentlyTeaching;
    }

    public List<Subject> getSubjectList()
    {
        return currentlyTeaching;
    }

    @Override
    public String getAllInfo() {
        return super.getAllInfo() + ", " + getSubjectList();
    }

    public void setSubjectList(List<Subject> subjectList)
    {
        this.currentlyTeaching = subjectList;
    }
}
