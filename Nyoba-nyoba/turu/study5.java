package turu;
import java.util.*;
public class study5 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("===== SISTEM PENILAIAN MAHASISWA =====");

    //Input
    System.out.print("Input Nilai UTS: ");
    double uts = sc.nextDouble();

    System.out.print("Input Nilai UAS: ");
    double uas = sc.nextDouble();

    System.out.print("Input Nilai Tugas: ");
    double tugas = sc.nextDouble();
    
    double hasil = (uts * 0.3) + (uas * 0.4) + (tugas * 0.3);
    if (hasil >= 85) {
        System.out.println("A");
    }else if (hasil >= 70) {
        System.out.println("B");
    }else if (hasil >= 55) {
        System.out.println("C");
    }else if (hasil >= 40) {
        System.out.println("D");
    }else {
        System.out.println("E");
    }
    if (uas < 40) {
        System.out.println("E");
    }
    sc.close();
    }
}
