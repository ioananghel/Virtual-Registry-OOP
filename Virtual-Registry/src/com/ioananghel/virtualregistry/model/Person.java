package com.ioananghel.virtualregistry.model;

public abstract class Person
{
    private String name;
    private String surname;
    private String cnp;
    private String address;
    private String phoneNumber;

    public Person(String name, String surname, String cnp, String address, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.cnp = cnp;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName()
    {
        return this.name +  " " + this.surname;
    }
    public String getInfo()
    {
        return "Person: " + getName() + ", Address: " + this.address + ", Phone Number: " + this.phoneNumber;
    }
    public String getQualification()
    {
        return "Person";
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCnp() {
        return cnp;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAllInfo()
    {
        return "All info: " + getName() + ", " + getCnp() + ", " + getAddress() + ", " + getPhoneNumber();
    }
}
