package com.example.matthew_comp303_assignment3;



public class Patient {

    // Attributes
    private Integer PatientID;
    private String FirstName;
    private String LastName;
    private Integer Age;
    private String BloodGroup;
    private String City;
    private String Phone;

    // Constructor
    public Patient(Integer PatientID, String FirstName, String LastName, Integer Age, String BloodGroup, String City, String Phone) {
        this.PatientID = PatientID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
        this.BloodGroup = BloodGroup;
        this.City = City;
        this.Phone = Phone;
    }


    // Getters and Setters
    public Integer getPatientID() {
        return PatientID;
    }

    public void setPatientID(Integer PatientID) {
        this.PatientID = PatientID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer Age) {
        this.Age = Age;
    }

    public String getBloodGroup() {
        return BloodGroup;
    }

    public void setBloodGroup(String BloodGroup) {
        this.BloodGroup = BloodGroup;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
}
