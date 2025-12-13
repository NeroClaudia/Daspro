import java.util.Scanner;

public class ujian2 {
    public static void main(String[] args) {
    
    Scanner sc =  new Scanner(System.in);

    System.out.println("Masukkan biaya tol tetap");
    double tolTetap = sc.nextDouble();

    System.out.println("Masukkan konsumsi BBM (Km/L)");
    double konsumsiBbm = sc.nextDouble();

    System.out.println("Masukkan jarak perjalan (Km)");
    double jarakPerjalanan = sc.nextDouble();

    System.out.println("Masukkan harga BBM");
    double hargaBbm = sc.nextDouble();

    System.out.println("Masukkan hari");
    int hari = sc.nextInt();
    double jasaSupir = 300000;
    
    
    double totSupir = hari * jasaSupir;
    double biayaBbm = jarakPerjalanan / konsumsiBbm;
    double biayaOperasional = biayaBbm * hargaBbm;
    double totalBiaya = biayaOperasional + tolTetap + totSupir;
    System.out.println("Total " + totalBiaya);

    sc.close();
    }
    
}
