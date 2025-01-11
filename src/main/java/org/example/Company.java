package org.example;

public class Company {

    private int id;
    private String name;
    private double giro;
    private String[] developerNames;


    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        setGiro(giro);  // giro değeri setter ile set edilecek
        this.developerNames = developerNames;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if (giro >= 0) {
            this.giro = giro;
        } else {
            System.out.println("Giro değeri 0'dan küçük olamaz.");
            this.giro = 0;  // Eğer negatif bir değer girildiyse, 0 olarak ayarlanır
        }
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public String addEmployee(int index, String name) {

        if (index < 0 || index >= developerNames.length) {
            return "Geçerli bir index değeri giriniz!";
        }

        // Eğer ilgili index zaten doluysa
        if (developerNames[index] != null && !developerNames[index].isEmpty()) {
            return "İlgili index doludur! Hata !!!";
        }

        // Eğer boşsa, parametre olarak gelen name'i ilgili index'e ata
        developerNames[index] = name;
        return "Developer başarıyla eklendi: " + name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + String.join(", ", developerNames) +
                '}';
    }
}
