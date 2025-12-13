package turu;
import java.util.Scanner;
public class monday {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("===== RECAP NILAI MAHASISWA =====");
    System.out.println("Nama: ");
    String nama = sc.nextLine();
    System.out.println("NIM: ");
    String nim = sc.nextLine();
    System.out.println("===== Materi 1: Calculus");
    System.out.print("Input Nilai UTS: ");
    double uts = sc.nextDouble();

    System.out.print("Input Nilai UAS: ");
    double uas = sc.nextDouble();

    System.out.print("Input Nilai Praktek: ");
    double praktek = sc.nextDouble();

    System.out.print("Input Nilai Tugas: ");
    double tugas = sc.nextDouble();

    double hasil = (uts * 0.3) + (uas * 0.35) * (praktek * 0.2) + (tugas * 0.15);
    System.out.println("===============================================");
    System.out.println("Materi 2: Fisika Kuantum");
    
    System.out.print("Input Nilai UTS: ");
    double uts2 = sc.nextDouble();

    System.out.print("Input Nilai UAS: ");
    double uas2 = sc.nextDouble();

    System.out.print("Input Nilai Praktek: ");
    double praktek2 = sc.nextDouble();

    System.out.print("Input Nilai Tugas: ");
    double tugas2 = sc.nextDouble();

    double hasil2 = (uts2 * 0.3) + (uas2 * 0.35) * (praktek2 * 0.2) + (tugas2 * 0.15);

    double rataRata = (hasil + hasil2) / 2;

    System.out.println("======================================== HASIL AKHIR ========================================");
    System.out.println("\t\t\tUTS\t\t\tUAS\t\t\tPraktek\t\t\tTugas");
    System.out.printf("UTS     : %.2f%n", uts);
    System.out.println("Nama: " + nama);
    System.out.println("NIM: " + nim);
    }
}
