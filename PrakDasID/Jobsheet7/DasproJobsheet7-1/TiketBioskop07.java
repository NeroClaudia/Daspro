import java.util.Scanner;
public class TiketBioskop07 {

    public static void print (String msg) {
        System.out.println(msg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    String namaPelanggan;
    double hargaTiket = 50000;
    double jmlTiket;
    double diskon = 0;
    double harga;
    double totHarga;
    double hargaDiskon;

    do {
        System.out.print("Nama Pelanggan: ");
        namaPelanggan = sc.nextLine();

        System.out.print("Jumlah Tiket: ");
        jmlTiket = sc.nextDouble();
        sc.nextLine();
        if (jmlTiket == 0) {
            
        }
        if (namaPelanggan.equalsIgnoreCase("batal")) {
            print("Transaksi Dibatalkan");
            break;
        }
        if (jmlTiket < 0) {
            print("Input Tidak Valid (Angka tidak boleh negatif)");
            continue;
        }
        if (jmlTiket > 4) 
            diskon = 0.01;
        else if (jmlTiket > 10)
            diskon = 0.15; 
        
        harga = jmlTiket * hargaTiket;
        hargaDiskon = diskon * harga;
        totHarga = harga - hargaDiskon;

        print("Nama Pelanggan: " + namaPelanggan);
        print("Total Yang Harus Dibayar: " + totHarga);
    }while(true);
    sc.close();
    }
}