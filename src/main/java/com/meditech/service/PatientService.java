package com.meditech.service;

import com.meditech.model.Patient;
import com.meditech.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    // CREATE: Add a new patient
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    // READ: Get all patients
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    // READ: Get a single patient by ID
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient with ID " + id + " not found."));
    }

    // UPDATE: Update patient details
    public Patient updatePatient(Long id, Patient updatedPatient) {
        return patientRepository.findById(id)
                .map(existingPatient -> {
                    existingPatient.setName(updatedPatient.getName());
                    existingPatient.setDisease(updatedPatient.getDisease());
                    existingPatient.setAge(updatedPatient.getAge());
                    return patientRepository.save(existingPatient);
                }).orElseThrow(() -> new RuntimeException("Patient with ID " + id + " not found."));
    }

    // DELETE: Remove a patient by ID
    public void deletePatient(Long id) {
        if (!patientRepository.existsById(id)) {
            throw new RuntimeException("Patient with ID " + id + " not found.");
        }
        patientRepository.deleteById(id);
    }
}
