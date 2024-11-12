package com.example.matthew_comp303_assignment3;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/bloodstock")
public class BloodStockController {

    //BloodstockService
    private final BloodStockService bloodStockService;

    //Constructor with dependency injection
    public BloodStockController(BloodStockService bloodStockService){
        this.bloodStockService = bloodStockService;
    }

    @GetMapping
    public Iterable<BloodStock> getAllBloodStocks(){
        return bloodStockService.getAllBloodStocks();
    }

    @PostMapping
    public BloodStock createBloodStock(@RequestBody BloodStock bloodStock){
        return bloodStockService.createBloodStock(bloodStock);
    }

    @PutMapping
    public BloodStock updateBloodStock(@RequestBody BloodStock bloodStock){
        return bloodStockService.updateBloodStock(bloodStock);
    }

    @DeleteMapping("/{id}")
    public String deleteBloodStock(@PathVariable Integer id){
        return bloodStockService.deleteBloodStock(id);
    }
}
