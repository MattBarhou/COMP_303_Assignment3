package com.example.matthew_comp303_assignment3;


import java.util.Date;

public class BloodStock {

    // Attributes
    private Integer BloodStockID;
    private String BloodGroup;
    private Integer Quantity;
    private Date BestBefore;
    private String Status;

    // Constructor
    public BloodStock(Integer BloodStockID, String BloodGroup, Integer Quantity, Date BestBefore, String Status) {
        this.BloodStockID = BloodStockID;
        this.BloodGroup = BloodGroup;
        this.Quantity = Quantity;
        this.BestBefore = BestBefore;
        this.Status = Status;
    }

    // Getters and Setters

    public Integer getBloodStockID() {
        return BloodStockID;
    }

    public void setBloodStockID(Integer BloodStockID) {
        this.BloodStockID = BloodStockID;
    }

    public String getBloodGroup() {
        return BloodGroup;
    }

    public void setBloodGroup(String BloodGroup) {
        this.BloodGroup = BloodGroup;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer Quantity) {
        this.Quantity = Quantity;
    }

    public Date getBestBefore() {
        return BestBefore;
    }

    public void setBestBefore(Date BestBefore) {
        this.BestBefore = BestBefore;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
}
