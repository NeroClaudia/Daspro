package utsDaspro;
import java.util.Scanner;
public class studycase1 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
    System.out.println("=== KALKULATOR BMI ===");

    System.out.println("Input Berat Badan mu (Kg)");
    double beratBadan = sc.nextDouble();
    System.out.println("Input Tinggi Badan (m)");
    double tinggiBadan = sc.nextDouble() / 100;

    double bmi = beratBadan / (Math.pow(tinggiBadan, 2));

    if (bmi < 18.5) {
        System.out.println("=== Nilai BMI ===");
        System.out.println(bmi);
        System.out.println("Kurang Berat Badan (Underweight)");
        System.out.println("=== Resiko Kesehatan: ===");
        System.out.println("1. Kekurangan Gizi");
        System.out.println("2. Osteoporosis");
        System.out.println("3. Penurunan Sistem Kekebalan Tubuh");

    }else if (bmi >= 18.5 && bmi < 25) {
        System.out.println("=== Nilai BMI ===");
        System.out.println(bmi);
        System.out.println("Berat Badan Normal (Normal Weight)");
        System.out.println("=== Risiko Kesehatan: ===");
        System.out.println("1. Meningkatnya Risiko Penyakit Jantung");
        System.out.println("2. Diabetes");
        System.out.println("3. Tekanan Darah Tinggi");

    }else if (bmi >= 30) {
        System.out.println("=== Nilai BMI ===");
        System.out.println(bmi);
        System.out.println("Obesitas (Obese)");
        System.out.println("=== Risiko Kesehatan: ===");
        System.out.println("1. Risiko Tinggi Penyakit Jantung");
        System.out.println("2. Diabetes");
        System.out.println("3. Tekanan Darah Tinggi");
        System.out.println("4. Masalah Pernapasan");
        System.out.println("5. Beberapa Jenis Kanker");
    }
    sc.close();
    }
    
    }
    

