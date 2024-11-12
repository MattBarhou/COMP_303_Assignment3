package com.example.matthew_comp303_assignment3;


import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class InMemoryBloodBankService implements BloodBankService {

    //Store in map
    private Map<Integer, BloodBank> bloodBanks = new ConcurrentHashMap<>();


    @Override
    public Iterable<BloodBank> getAllBloodBanks() {
        return bloodBanks.values();
    }

    @Override
    public BloodBank createBloodBank(BloodBank bloodBank) {
        bloodBanks.put(bloodBank.getBloodBankID(), bloodBank);
        return bloodBank;
    }

    @Override
    public BloodBank updateBloodBank(BloodBank bloodBank) {
        Integer id = bloodBank.getBloodBankID();

        if (bloodBanks.containsKey(id)){
            bloodBanks.put(id, bloodBank);
            return bloodBank;
        }
        else {
            throw new IllegalArgumentException("Blood Bank does not exist");
        }
    }

    @Override
    public String deleteBloodBank(Integer id) {
       bloodBanks.remove(id);
       return "Blood Bank Deleted";
    }
}
