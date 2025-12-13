import java.util.Scanner;

public class ujian {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Masukkan panjang (cm)");
    double panjang = sc.nextDouble();
    System.out.println("Masukkan lebar (cm)");
    double lebar = sc.nextDouble();

    double inchPanjang = panjang / 2.54;
    double inchLebar = lebar / 2.54;
    
    System.out.println("Masukkan tarif per inch");
    double tarif = sc.nextDouble();
    
    double luas = inchPanjang * inchLebar;
    System.out.println("Total luas (inch) " +luas);
    
    double totTarif = luas * tarif;
    System.out.println("Total tarif per inch Rp " + totTarif);
    
    sc.close();
    }
}