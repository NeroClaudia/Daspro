package turu;
import java.util.Scanner;
public class study2 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    double bonus = 0;

    System.out.println("=== BONUS KARYAWAN ===");

    //Input
    System.out.print("Input Nilai Kinerja (Skala 1-100): ");
    double nilaiKinerja = sc.nextDouble();

    System.out.print("Input Lama Bekerja (Tahun): ");
    double lamaBekerja = sc.nextDouble();
    
    System.out.print("Input Gaji Pokokmu (Rp): ");
    double gajiPokok = sc.nextDouble();
    sc.nextLine();
    System.out.print("Apakah anda memiliki sertifikasi? (Ya/Tidak): ");
    String inputSertifikasi = sc.nextLine();
    
    boolean sertifikasi = inputSertifikasi.trim().equalsIgnoreCase("ya");

    if (sertifikasi) {
        System.out.println("=== HASIL ===");
        bonus += 500000;
        System.out.println("Bonus Tambahan: " + "Rp. " + Math.round(bonus));
    }else {
        System.out.println("=== HASIL ===");
        System.out.println("Tidak ada sertifikasi");
    }
    //Sistem Perhitungan Bonus
    if (nilaiKinerja < 70) {
        System.out.println("Sayang sekali, anda tidak mendapatkan bonus");
    }
    if (nilaiKinerja >= 70) {
        if (lamaBekerja < 2) {
            bonus += 0.01 * gajiPokok;
        }else if (lamaBekerja >= 2 && lamaBekerja < 5) {
            bonus += 0.03 * gajiPokok;
        }else {
            bonus += 0.05 * gajiPokok;
        }
        if (nilaiKinerja >= 90) {
            if (lamaBekerja < 2) {
                bonus += 0.02 * gajiPokok;
            }else if (lamaBekerja <= 2 && lamaBekerja < 5) {
                bonus += 0.04 * gajiPokok;
            }else {
                bonus += 0.07 * gajiPokok;
            }
            }
            }
            System.out.println("==========================");
            System.out.println("Total bonus yang didapatkan adalah: " + "Rp. " + Math.round(bonus));
            sc.close();
            }

        }
    
    

