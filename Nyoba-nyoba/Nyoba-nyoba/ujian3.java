import java.util.Scanner;

public class ujian3 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Masukkan nilai kuis");
    double kuis = sc.nextDouble() * 0.30;
    System.out.println("Masukkan nilai UTS");
    double UTS = sc.nextDouble() * 0.30;
    System.out.println("Masukkan nilai UAS");
    double UAS = sc.nextDouble() * 0.40;
    
    double total = kuis + UTS + UAS;
    System.out.println("Nilai akhir mahasisawa " + total);
    
    sc.close();
    }
}
