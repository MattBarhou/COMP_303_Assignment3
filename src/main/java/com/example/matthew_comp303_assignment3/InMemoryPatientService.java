package com.example.matthew_comp303_assignment3;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Service
public class InMemoryPatientService implements PatientService {

    //Store in map
    private final Map<Integer, Patient> patients = new ConcurrentHashMap<>();

    @Override
    public Iterable<Patient> getAllPatients() {
        return patients.values();
    }

    @Override
    public Patient createPatient(Patient patient) {
        patients.put(patient.getPatientID(), patient);
        return patient;
    }

    @Override
    public Patient updatePatient(Patient patient) {
        Integer id = patient.getPatientID();

        if (patients.containsKey(id)){
            patients.put(id, patient);
            return patient;
        }
        else {
            throw new IllegalArgumentException("Patient does not exist");
        }
    }

    @Override
    public String deletePatient(Integer id) {
        patients.remove(id);
        return "Patient Deleted";
    }
}
