package com.example.matthew_comp303_assignment3;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {

    //PatientService
    private final PatientService patientService;

    //Constructor with dependency injection
    public PatientController(PatientService patientService){
        this.patientService = patientService;
    }

    @GetMapping
    public Iterable<Patient> getAllPatients(){
        return patientService.getAllPatients();
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient){
        return patientService.createPatient(patient);
    }

    @PutMapping
    public Patient updatePatient(@RequestBody Patient patient){
        return patientService.updatePatient(patient);
    }

    @DeleteMapping("/{id}")
    public String deletePatient(@PathVariable Integer id){
        return patientService.deletePatient(id);
    }
}
