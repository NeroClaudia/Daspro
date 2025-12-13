package jokowi;
public class Student {
    private String name;
    private String nim;
    private double gpa;

    // Constructor
    public Student(String name, String nim, double gpa) {
        this.name = name;
        this.nim = nim;
        this.gpa = gpa;
    }

    // Getter & Setter (Encapsulation)
    public String getName() {
        return name;
    }

    public String getNim() {
        return nim;
    }

    public double getGpa() {
        return gpa;
    }

    // Method untuk menampilkan info
    public void displayInfo() {
        System.out.println("Nama: " + name + " | NIM: " + nim + " | IPK: " + gpa);
    }
}
