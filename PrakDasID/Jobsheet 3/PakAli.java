import java.util.Scanner;

public class PakAli {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    //Harga motor (x)
    
    System.out.println("Masukkan Harga motor (Rp)");
    double hargaMotor=sc.nextDouble();

    //Uang muka (y)
    
    System.out.println("Masukkan uang muka (Rp)");
    double uangMuka=sc.nextDouble();

    //Lama cicilan (z)
    
    System.out.println("Masukkan lama cicilan");
    double lamaCicilan=sc.nextDouble();

    //sisa

    double sisa = hargaMotor - uangMuka;

    //bunga total

    double totBunga=0.01*sisa*lamaCicilan;

    //total bayar

    double totBayar = sisa + totBunga;

    //cicilan per bulan

    double cicilanPerBulan = totBayar / lamaCicilan;

    System.out.println("Jumlah cicilan per bulan yang harus dibayar Pak Ali adalah " +cicilanPerBulan);

    sc.close();

    }
    
}
