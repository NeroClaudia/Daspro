package turu;
import java.util.Scanner;
public class study8 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("=== KALKULATOR BMI ===");
    
    System.out.print("Input Berat Badan: ");
    double beratBadan = sc.nextDouble();

    System.out.print("Input Tinggi Badan: ");
    double tinggiBadan = sc.nextDouble() / 100;
    
    double bmi = beratBadan / (Math.pow(tinggiBadan, 2));

    if (bmi < 18.5) {
        System.out.println("===== HASIL =====");
        System.out.println("Nilai BMI: " + (int) bmi);
        System.out.println("Kategori BMI: Kurang Berat Badan (Underweight)");
        System.out.println("Risiko Kesehatan:");
        System.out.println("1. Kekurangan Gizi");
        System.out.println("2. Osteoporosis");
        System.out.println("3. Penurunan Sistem Kekebalan Tubuh");

        }else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("===== BMI =====");
            System.out.println("Nilai BMI: " + (int) bmi);
            System.out.println("Kategori BMI: Berat Badan Normal (Normal Weight)");
            System.out.println("Risiko Kesehatan:");
            System.out.println("1. Relatif Rendah");

        }else if (bmi >= 25 && bmi < 30) {
            System.out.println("===== HASIL =====");
            System.out.println("Nilai BMI: " + (int) bmi);
            System.out.println("Kategori BMI: Kelebihan Berat Badan (Overweight)");
            System.out.println("Risiko Kesehatan:");
            System.out.println("1. Meningkatnya Risiko Penyakit Jantung");
            System.out.println("2. Diabetes");
            System.out.println("3. Tekanan Darah Tinggi");
        }else {
            System.out.println("===== HASIL =====");
            System.out.println("Nilai BMI: " + (int) bmi);
            System.out.println("Kategori BMI: Obesitas (Obese)");
            System.out.println("Risiko Kesehatan:");
            System.out.println("1. Risiko Tinggi Penyakit Jantung");
            System.out.println("2. Diabetes");
            System.out.println("3. Tekanan Darah Tinggi");
            System.out.println("4. Masalah Pernapasan");
            System.out.println("5. Beberapa Jenis Kanker");

        }
        sc.close();
    
    }
}
