package com.example.matthew_comp303_assignment3;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/bloodbank")
public class BloodBankController {

    //BloodBankService
    private final BloodBankService bloodBankService;

    //Constructor with dependency injection
    public BloodBankController(BloodBankService bloodBankService){
        this.bloodBankService = bloodBankService;
    }

    @GetMapping
    public Iterable<BloodBank> getAllBloodBanks(){
        return bloodBankService.getAllBloodBanks();
    }

    @PostMapping
    public BloodBank createBloodBank(@RequestBody BloodBank bloodBank){
        return bloodBankService.createBloodBank(bloodBank);
    }

    @PutMapping
    public BloodBank updateBloodBank(@RequestBody BloodBank bloodBank){
        return bloodBankService.updateBloodBank(bloodBank);
    }

    @DeleteMapping("/{id}")
    public String deleteBloodBank(@PathVariable Integer id){
        return bloodBankService.deleteBloodBank(id);
    }
}
