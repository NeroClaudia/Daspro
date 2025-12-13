import java.util.Scanner;

public class ujian4 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Masukkan berapa GB yang anda akan simpan");
    double Gigabyte = sc.nextDouble();

    System.out.println("Masukkan tarif per TB");
    double tarifTB = sc.nextDouble();

    double Terabyte = Gigabyte / 1000;
    double tarif = Terabyte * tarifTB;
    double ppn = tarif * 0.11;
    double totalTarif = ppn + tarif;

    System.out.println("Total pembayaran cloud " + totalTarif);

    sc.close();
    }
}