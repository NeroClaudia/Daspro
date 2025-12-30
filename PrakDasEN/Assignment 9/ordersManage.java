import java.util.Scanner;

public class ordersManage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah Pesanan: ");   
        int jmlPesanan = sc.nextInt();
        sc.nextLine();

        String[] pesanan = new String[jmlPesanan];
        double[] harga = new double[jmlPesanan];

        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("Pesanan ke- " + (i + 1));
            System.out.println();
            System.out.print("Nama Pesanan (Makanan/Minuman): ");
            pesanan[i] = sc.nextLine();

            System.out.print("Harga Pesanan: ");
            harga[i] = sc.nextDouble();
            sc.nextLine();
        }
        double total = 0;
        for (int i = 0; i < jmlPesanan; i++) {
            total += harga[i];
        }
        System.out.println("===============================");
        System.out.println("\tPESANAN ANDA");
        System.out.println("===============================");
        System.out.printf("%-10s %-10s %15s", "No", "Pesanan", "Harga");
        
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.printf("\n%-10s %-10s Rp %10.2f", (i + 1), pesanan[i], harga[i]);
        }
        System.out.println("");
        System.out.println("\nTotal: " + total);
        sc.close();

    }
}