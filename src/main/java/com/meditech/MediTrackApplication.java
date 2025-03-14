package com.meditech;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MediTrackApplication implements CommandLineRunner {

    public static void main(String[] args) {
        System.out.println("\n\nStarting MediTrack Application...");
        SpringApplication.run(MediTrackApplication.class, args);
        System.out.println("\nMediTrack is up and running on http://localhost:8080");
        System.out.println("\nH2 Console available at: http://localhost:8080/h2-console");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n\n------- System Initialized: Welcome to MediTrack - Your Healthcare Management System!");
        System.out.println("\n------ Available Endpoints:");
        System.out.println("[GET]  http://localhost:8080/patients       - Get all patients");
        System.out.println("[POST] http://localhost:8080/patients      - Add a new patient");
        System.out.println("[GET]  http://localhost:8080/patients/{id} - Get patient by ID");
        System.out.println("[PUT]  http://localhost:8080/patients/{id} - Update patient by ID");
        System.out.println("[DELETE] http://localhost:8080/patients/{id} - Delete patient by ID");
    }
}
