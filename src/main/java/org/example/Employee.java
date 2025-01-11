package org.example;

import java.util.Arrays;

public class Employee {

    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;


    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public int getId() {
        return this.id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // public String getPassword(){
    //    return this.password;
    // }


    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return this.healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    public String addHealthPlan(int index, String name) {
        if (index < 0 || index >= healthPlans.length) {
            return "özellik eklenemez";
        } else if (healthPlans[index] != null) {
            return "ilgili index doludur! Hata !!!";
        } else {
            healthPlans[index] = name;
            return "Healthplan eklendi" + name;
        }

    }

        @Override
        public String toString () {
            return "Employee{" +
                    "id=" + id +
                    ", fullName='" + fullName + '\'' +
                    ", email='" + email + '\'' +
                    //    ", password='" + password + '\'' +
                    ", healthPlans=" + Arrays.toString(healthPlans) +
                    '}';
        }

}
