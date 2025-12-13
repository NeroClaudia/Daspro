package utsDaspro;
import java.util.Scanner;

public class studycase3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PROGRAM MENENTUKAN BILANGAN TERBESAR ===");

        System.out.print("Masukkan angka pertama: ");
        double a = sc.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double b = sc.nextDouble();

        System.out.print("Masukkan angka ketiga: ");
        double c = sc.nextDouble();
        
        double max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("\n=== HASIL ===");
        if (a == max && b == max && c == max) {
            System.out.println("Semua angka sama besar: " + a);
        } else if (a == max && b == max) {
            System.out.println("Ada dua angka terbesar yang sama: " + a + " dan " + b);
        } else if (a == max && c == max) {
            System.out.println("Ada dua angka terbesar yang sama: " + a + " dan " + c);
        } else if (b == max && c == max) {
            System.out.println("Ada dua angka terbesar yang sama: " + b + " dan " + c);
        } else {
            System.out.println("Angka terbesar adalah: " + max);
        }

        sc.close();
    }
}
