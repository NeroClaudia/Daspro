import java.util.Scanner;

public class neko {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("=== NILAI UJIAN ===");
    System.out.println("=== Masukkan Nilai Ujian UTS mu ===");
    
    System.out.println("Masukkan Nilai Biologi");
    int biologi = sc.nextInt();
    System.out.println("Masukkan Nilai Kimia");
    int kimia = sc.nextInt();
    System.out.println("Masukkan Nilai Matematika");
    int matematika = sc.nextInt();
    System.out.println("Masukkan Nilai Bindo");
    int bindo = sc.nextInt();
    System.out.println("Masukkan Nilai Filsafat");
    int filsafat = sc.nextInt();
    System.out.println("Masukkan Nilai BJawa");
    int bjawa = sc.nextInt();
    System.out.println("Masukkan Nilai Fisika");
    int fisika = sc.nextInt();

    int rataRata = (biologi + kimia + matematika + bindo + filsafat + bjawa + fisika) / 7;
    System.out.println("Rata-rata nilai ujianmu adalah: " + rataRata);

    if (rataRata >= 90) {
        System.out.println("A");
    }else if (rataRata >= 80) {
        System.out.println("B");
    }else if (rataRata >= 70) {
        System.out.println("C");
    }else if (rataRata >= 60) {
        System.out.println("D");
    }else {
        System.out.println("E");
    }
    sc.close();
    }
}