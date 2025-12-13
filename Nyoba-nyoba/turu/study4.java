package turu;
import java.util.Scanner;

public class study4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== KALKULATOR DISKON BELANJA ===");

        // Input data pelanggan
        System.out.print("Masukkan jenis keanggotaan (Silver/Gold/Platinum): ");
        String keanggotaan = sc.nextLine();

        System.out.print("Masukkan total belanja (Rp): ");
        double totalBelanja = sc.nextDouble();
        sc.nextLine(); // membersihkan buffer

        System.out.print("Apakah Anda menggunakan E-Wallet? (Ya/Tidak): ");
        String inputPembayaran = sc.nextLine();

        // Konversi ke boolean (tanpa peduli besar kecil huruf atau spasi)
        boolean pakaiEwallet = inputPembayaran.trim().equalsIgnoreCase("ya");

        double diskon = 0;

        // ===============================
        // Logika utama keanggotaan
        // ===============================
        if (keanggotaan.equalsIgnoreCase("Silver")) {
            if (totalBelanja > 1000000) {
                diskon = 0.05;
            } else {
                diskon = 0.03;
            }
        } else if (keanggotaan.equalsIgnoreCase("Gold")) {
            if (totalBelanja > 1000000) {
                diskon = 0.10;
            } else {
                diskon = 0.07;
            }
        } else if (keanggotaan.equalsIgnoreCase("Platinum")) {
            if (totalBelanja > 1000000) {
                diskon = 0.15;
            } else {
                diskon = 0.12;
            }
        } else {
            System.out.println("Jenis keanggotaan tidak valid!");
            sc.close();
            return;
        }

        // ===============================
        // Logika tambahan berdasarkan boolean
        // ===============================
        if (pakaiEwallet) {
            System.out.println("✅ Pembayaran menggunakan E-Wallet, tambahan diskon 2%");
            diskon += 0.02;
        } else {
            System.out.println("💵 Pembayaran menggunakan Cash, tidak ada tambahan diskon");
        }

        // ===============================
        // Hitung total
        // ===============================
        double totalDiskon = totalBelanja * diskon;
        double totalBayar = totalBelanja - totalDiskon;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Keanggotaan: " + keanggotaan);
        System.out.println("Total Belanja: Rp " + totalBelanja);
        System.out.println("Metode Pembayaran: " + (pakaiEwallet ? "E-Wallet" : "Cash"));
        System.out.println("Total Diskon: " + (diskon * 100) + "%");
        System.out.println("Jumlah Diskon: Rp " + totalDiskon);
        System.out.println("Total yang Harus Dibayar: Rp " + totalBayar);

        sc.close();
    }
}
