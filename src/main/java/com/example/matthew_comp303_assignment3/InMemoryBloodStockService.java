package com.example.matthew_comp303_assignment3;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class InMemoryBloodStockService implements BloodStockService {

    //Store in map
    private final Map<Integer, BloodStock> bloodStocks = new ConcurrentHashMap<>();

    @Override
    public Iterable<BloodStock> getAllBloodStocks() {
        return bloodStocks.values();
    }

    @Override
    public BloodStock createBloodStock(BloodStock bloodStock) {
        bloodStocks.put(bloodStock.getBloodStockID(), bloodStock);
        return bloodStock;
    }

    @Override
    public BloodStock updateBloodStock(BloodStock bloodStock) {
        Integer id = bloodStock.getBloodStockID();

        if (bloodStocks.containsKey(id)){
            bloodStocks.put(id, bloodStock);
            return bloodStock;
        }
        else {
            throw new IllegalArgumentException("Blood Stock does not exist");
        }
    }

    @Override
    public String deleteBloodStock(Integer id) {
        bloodStocks.remove(id);
        return "Blood Stock Deleted";
    }
}
