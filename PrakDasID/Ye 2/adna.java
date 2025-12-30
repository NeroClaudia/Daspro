import java.util.Scanner;

public class adna {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    double biayaCetak = 200;
    double hardCover = 20000;
    double bookPaper = 3;
    double biayaPengiriman = 15000;
    double beratHc = 250;
    double beratPacking = 300;

    System.out.println("Halaman buku");
    double halamanBuku = sc.nextDouble();
    System.out.println("Jumlah kertas");
    double jml_kertas = sc.nextDouble();

    double jumlahKertas = halamanBuku / 2;
    double berat_kertas = jumlahKertas * bookPaper;
    double totalBerat = berat_kertas + beratHc + beratPacking;
    double totalCetak = jml_kertas * biayaCetak;
    double total_biaya_pengiriman = totalBerat * biayaPengiriman;
    double totalBiaya = total_biaya_pengiriman + totalCetak + hardCover;

    System.out.println("Total biaya " + totalBiaya);

    sc.close();


    }
}
