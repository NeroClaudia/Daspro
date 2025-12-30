import java.util.Scanner;

public class MenghitungTotalBayar07 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    //Variabel

  
    double harga=sc.nextInt();
    double potongan=sc.nextDouble();
    double jml_bayar=sc.nextDouble();
    double diskon=0.15;

    harga=sc.nextInt();
    jml_bayar=harga*potongan;
    potongan=diskon*harga;
    

    System.out.println("Jumlah yang harus anda bayar adalah Rp. " + jml_bayar);

    sc.close();
        
    }
    
}
