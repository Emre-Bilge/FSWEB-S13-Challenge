package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void executeOperations() {
        // 1. Employee sınıfı için bir obje oluştur ve işlemler yap
        String[] healthPlans = new String[2];
        Employee employee = new Employee(101, "Ahmet Yılmaz", "ahmet@example.com", "1234", healthPlans);
        System.out.println(employee.addHealthPlan(0, "Basic Health Plan"));
        System.out.println(employee.addHealthPlan(1, "Premium Health Plan"));
        System.out.println(employee.addHealthPlan(1, "Extra Health Plan")); // Hata: İlgili index dolu
        System.out.println(employee.addHealthPlan(2, "Invalid Index Plan")); // Hata: Geçersiz index
        System.out.println(employee); // Employee objesini yazdır

        // 2. Company sınıfı için bir obje oluştur ve işlemler yap
        String[] developerNames = new String[3];
        Company company = new Company(201, "TechCorp", 50000, developerNames);
        System.out.println(company.addEmployee(0, "Ali Kaya"));
        System.out.println(company.addEmployee(1, "Ayşe Demir"));
        System.out.println(company.addEmployee(1, "Mehmet Öz")); // Hata: İlgili index dolu
        System.out.println(company.addEmployee(-1, "Invalid Developer")); // Hata: Geçersiz index
        System.out.println(company); // Company objesini yazdır

        // 3. Plan sınıfı için bir obje oluştur ve işlemler yap
        Plan selectedPlan = Plan.BASIC;
        System.out.println("Selected Plan: " + selectedPlan.getName() + ", Price: $" + selectedPlan.getPrice());

        // 4. Healthplan sınıfı için bir obje oluştur ve işlemler yap
        Healthplan healthplan = new Healthplan(301, "Family Plan", Plan.BASIC);
        System.out.println(healthplan); // Healthplan objesini yazdır
    }
}