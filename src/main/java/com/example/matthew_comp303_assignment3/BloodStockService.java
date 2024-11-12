package com.example.matthew_comp303_assignment3;

import java.util.List;



public interface BloodStockService {

    //Get all bloodstock info
    public Iterable<BloodStock> getAllBloodStocks();

    //Create a new BloodStock
    public BloodStock createBloodStock(BloodStock bloodStock);

    //Update a BloodStock
    public BloodStock updateBloodStock(BloodStock bloodStock);

    //Delete a BloodStock
    public String deleteBloodStock(Integer id);
}
