package turu;
import java.util.Scanner;

public class study6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEM EVALUASI KARYAWAN ===");
        System.out.print("Masukkan lama kerja (tahun): ");
        int lamaKerja = sc.nextInt();

        System.out.print("Masukkan nilai kinerja (1–100): ");
        int nilai = sc.nextInt();

        System.out.println("Pilih jabatan:");
        System.out.println("1. Staff");
        System.out.println("2. Supervisor");
        System.out.println("3. Manager");
        System.out.print("Pilihan: ");
        int jabatan = sc.nextInt();

        double bonusPersen = 0;

        // Gunakan switch untuk menentukan aturan berdasarkan jabatan
        switch (jabatan) {
            case 1: // Staff
                if (nilai >= 85) {
                    bonusPersen = 0.10;
                } else if (nilai >= 70) {
                    bonusPersen = 0.05;
                } else {
                    bonusPersen = 0.0;
                }
                break;

            case 2: // Supervisor
                if (nilai >= 85) {
                    bonusPersen = 0.15;
                } else if (nilai >= 70) {
                    bonusPersen = 0.07;
                } else {
                    bonusPersen = 0.0;
                }
                break;

            case 3: // Manager
                if (nilai >= 85) {
                    bonusPersen = 0.20;
                } else if (nilai >= 70) {
                    bonusPersen = 0.10;
                } else {
                    bonusPersen = 0.0;
                }
                break;

            default:
                System.out.println("Jabatan tidak valid!");
                sc.close();
                return;
        }

        // Bonus tambahan jika lama kerja >= 5 tahun
        if (lamaKerja >= 5 && bonusPersen > 0) {
            bonusPersen += 0.05;
        }

        System.out.println("\n=== HASIL EVALUASI ===");
        switch (jabatan) {
            case 1 -> System.out.println("Jabatan: Staff");
            case 2 -> System.out.println("Jabatan: Supervisor");
            case 3 -> System.out.println("Jabatan: Manager");
        }

        System.out.println("Nilai Kinerja: " + nilai);
        System.out.println("Lama Kerja: " + lamaKerja + " tahun");
        System.out.println("Bonus yang didapat: " + (bonusPersen * 100) + "%");

        sc.close();
    }
}
