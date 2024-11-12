package com.example.matthew_comp303_assignment3;


public interface BloodBankService {

    //Get all bloodbank info
    public Iterable<BloodBank> getAllBloodBanks();

    //Create a new BloodBank
    public BloodBank createBloodBank(BloodBank bloodBank);

    //Update a BloodBank
    public BloodBank updateBloodBank(BloodBank bloodBank);

    //Delete a BloodBank
    public String deleteBloodBank(Integer id);
}
