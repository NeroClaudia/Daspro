package turu;
import java.util.*;
public class study3 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("=== MENENTUKAN BILANGAN TERBESAR DARI TIGA ANGKA ===");

    System.out.println("Input Nilai Pertama");
    int x = sc.nextInt();
    
    System.out.println("Input Nilai kedua");
    int y = sc.nextInt();

    System.out.println("Input Nilai Ketiga");
    int z = sc.nextInt();
    
    int terbesar = Math.max(x, Math.max(y, z));
    
    System.out.println("Nilai Terbesar Adalah: " + terbesar);
    
    System.out.print("Angkat terbesar dimiliki oleh: ");
    boolean adSama = false;

    if (x == terbesar) {
        System.out.println("X");
        adSama = true;
    }
    if (y == terbesar) {
        System.out.println("Y");
        adSama = true;
    }
    if (z == terbesar) {
        System.out.println("Z");
        adSama = true;
    }
    if (!adSama) {
        System.out.println("Tidak ada nilai yang sama");
    }else {
        System.out.println();
    }
    sc.close();
    }
}
