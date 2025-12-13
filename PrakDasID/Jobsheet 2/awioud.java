import java.util.Scanner;

public class awioud {
    public static void main(String[] args) {
        
    Scanner sc  = new Scanner(System.in);

    //Gaji pokok

    System.out.println("Masukkan gaji pokok");
    int gaji_pokok_awal = sc.nextInt();

    //Tunjangan anak

    System.out.println("Masukkan jumlah anak");
    int jumlah_anak = sc.nextInt();

    System.out.println("Masukkan tunjangan per anak");
    double tunjangan_per_anak = sc.nextDouble();

    //Total tunjangan anak
    double total_tunjangan_anak = jumlah_anak * tunjangan_per_anak;

    //Tunjangan transport
    System.out.println("Masukkan persentase tunjangan transport");
    double persentase_transport = sc.nextDouble();

    //Total tunjangan transport
    double total_transport = persentase_transport * gaji_pokok_awal;

    //total gaji kotor

    double gajiKotor = gaji_pokok_awal + total_tunjangan_anak + total_transport;

    //potongan simpanan wajib

    System.out.println("Masukkan persentase potongan simpanan wajib");
    double persentase_simpanan = sc.nextDouble();
    double total_potongan = persentase_simpanan * gaji_pokok_awal;
    
    //potongan pajak

    System.out.println("Masukkan persentase potongan pajak");
    double persentase_pajak = sc.nextDouble();
    double totalPajak = persentase_pajak * gajiKotor;

    //Total gaji bersih
    double gajiBersih = gajiKotor - (total_potongan + totalPajak);

    //Epilog

    System.out.println("Gaji pokok: " + gaji_pokok_awal);
    System.out.println("Total tunjangan anak: " + total_tunjangan_anak);
    System.out.println("Total tunjangan transport: " + total_transport);
    System.out.println("Total gaji kotor " + gajiKotor);
    System.out.println("Total simpanan wajib: " + total_potongan);
    System.out.println("Total potongan pajak: " + totalPajak);
    System.out.println("Total gaji bersih: " + gajiBersih);


    sc.close();
    }
    
}
