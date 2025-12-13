package utsDaspro;
import java.util.Scanner;
public class studycase2 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    double bonus = 0;
    
    System.out.println("=== BONUS KARYAWAN ===");
    
    System.out.println("Input Nilai Kinerja (Skala 1-100)");
    double nilaiKinerja = sc.nextDouble();

    System.out.println("Input Gaji Pokok (Rp.)");
    double gajiPokok = sc.nextDouble();

    System.out.println("Sertifikasi (true/false)");
    boolean sertifikasi = sc.nextBoolean();

    System.out.println("Input Lama Bekerja (Dalam Tahun)");
    double lamaBekerja = sc.nextDouble();

    if (nilaiKinerja < 70) {
        bonus = 0;
    }else if (nilaiKinerja >= 70 && nilaiKinerja < 90) {
        if (lamaBekerja < 2) {
            bonus = 0.01 * gajiPokok;
            System.out.println("Total bonus mu adalah: " + bonus);
        }else if (lamaBekerja >= 2 && lamaBekerja < 5) {
            bonus = 0.03 * gajiPokok;
            System.out.println("Total bonus mu adalah: " + bonus);
        }else {
            bonus = 0.05 * gajiPokok;
            System.out.println("Total bonus mu adalah: " + bonus);
        }
        if (nilaiKinerja >= 90) {
            if (lamaBekerja < 2) {
                bonus = 0.02 * gajiPokok;
                System.out.println("Total gaji mu adalah: " + bonus);
            }else if (lamaBekerja <= 2 && lamaBekerja < 5) {
                bonus = 0.04 * gajiPokok;
                System.out.println("Total bonus mu adalah: " + bonus);
            }else {
                bonus = 0.07 * gajiPokok;
                System.out.println("Total bonus mu adalah: " + bonus);
            }
            if (sertifikasi) {
                bonus += 500000;
            }
            sc.close();
        }
    }
    }
}

