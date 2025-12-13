import java.util.Scanner;
public class dqwd {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Jumlah Peserta: ");
    int jumlahPeserta = sc.nextInt();
    System.out.println("Jumlah judul karya");
    int jml_judul_karya = sc.nextInt();
    System.out.println("Jumlah tim");

    int tim = sc.nextInt();
    double publikasi = 300000;
    double dekorasi = 500000;
    double konsumsi = 500000;
    double hadiah = 4000000;
    double biayaOperasional = 500000;
    double biayaKomsumsi = 25000;
    double honorariumJudul = 75000;
    double biayaPendaftaran = 50000;
    double polinema = 0.6;

    double totalKonsumsi = jumlahPeserta * biayaKomsumsi;
    double totalHonorarium = jml_judul_karya * honorariumJudul;
    double totalPendaftaran = tim * biayaPendaftaran;
    double totalAnggaran = publikasi + dekorasi + konsumsi + hadiah + biayaOperasional + totalKonsumsi + totalHonorarium;
    double anggaranPolinema = totalAnggaran * polinema;
    double totalSponsor = (totalAnggaran - anggaranPolinema) - totalPendaftaran;
    
    System.out.println("Total biaya sponsor " + totalSponsor);

    sc.close();

    }
}