package com.example.matthew_comp303_assignment3;


import java.util.List;


public interface PatientService {

    //Get all patients
    public Iterable<Patient> getAllPatients();

    //Create a new patient
    public Patient createPatient(Patient patient);

    //Update a patient
    public Patient updatePatient(Patient patient);

    //Delete a patient
    public String deletePatient(Integer id);
}
