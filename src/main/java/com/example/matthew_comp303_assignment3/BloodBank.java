package com.example.matthew_comp303_assignment3;


public class BloodBank {

    // Attributes
    private Integer BloodBankID;
    private String Address;
    private String City;
    private String Phone;
    private String Email;


    // Constructor
    public BloodBank(Integer BloodBankID, String Address, String City, String Phone, String Email) {
        this.BloodBankID = BloodBankID;
        this.Address = Address;
        this.City = City;
        this.Phone = Phone;
        this.Email = Email;
    }


    // Getters and Setters
    public Integer getBloodBankID() {
        return BloodBankID;
    }

    public void setBloodBankID(Integer BloodBankID) {
        this.BloodBankID = BloodBankID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
}
