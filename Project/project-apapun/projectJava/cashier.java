package projectJava;
import java.util.Scanner;
public class cashier {

    public static void print (String ctk) {
        System.out.println(ctk);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    int buayaGoreng = 20000;
    int penisKuda = 30000;
    int sateBiawak = 28000;
    int tehBeracun = 15000;
    int jeroanBabi = 24000;
    print("========== CASHIER ==========");
    print("Menu:");
    print("1. Buaya Goreng (Rp 20.000)");
    print("2. Penis Kuda (Rp 30.000)");
    print("3. Sate Biawak (Rp 28.000)");
    print("4. Teh Beracun (Rp 15.000)");
    print("5. Jeroan Babi (Rp 24.000)");
    print("===========================================");
    System.out.print("Pilih Menu (Angka 1-5): ");
    String input = sc.nextLine();
    }
}