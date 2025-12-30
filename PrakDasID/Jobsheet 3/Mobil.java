import java.util.Scanner;

public class Mobil {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Jarak kota (Km)");
    double jarak = sc.nextDouble();
    double hargaBensin = 10000;
    
    double rataRata = jarak / 2;
    double biaya = rataRata * hargaBensin;
    System.out.println("Total biaya " +biaya);

    sc.close();
    
    }
    
}
