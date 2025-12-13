import java.util.Scanner;

public class StudiKasus1 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    //Gaji pokok

    System.out.println("Masukkan gaji pokok awal");
    double gaji_pokok_awal = sc.nextDouble();

    //jumlah anak

    System.out.println("Masukkan jumlah anak");
    int anak = sc.nextInt();
    
    //Tunjangan per anak

    System.out.println("Masukkan tunjangan per anak");
    double tunjangan_per_anak = sc.nextDouble();

    //Potongan simpanan wajib

    System.out.println("Masukkan persentase simpanan wajib");
    double persentase_simpanan_wajib = sc.nextDouble();

    //Hitung total tunjangan anak
    double total_tunjangan_anak = anak * tunjangan_per_anak;

    //hitung potongan simpanan wajib
    double potongan_simpanan_wajib = persentase_simpanan_wajib * gaji_pokok_awal;

    //Hitung gaji bersih
    double gajiBersih = gaji_pokok_awal + total_tunjangan_anak - potongan_simpanan_wajib;
    
    //output
    
    System.out.println("\n=== HASIL PERHITUNGAN ===");
    System.out.println("Total Tunjangan Anak " + total_tunjangan_anak);
    System.out.println("Potongan simpanan wajib " + potongan_simpanan_wajib);
    System.out.println("Gaji bersih " + gajiBersih);

    sc.close();


    }
    
}
