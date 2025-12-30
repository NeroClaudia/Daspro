import java.util.Scanner;

public class GajiKaryawan07 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    //Variabel

    int gajiPokok;
    double bonus, totGaji;
    double tunjTransp=600000;
    double tunjMkn=400000;

    gajiPokok=sc.nextInt();

    //hitung bonus
    bonus= 0.05*gajiPokok;
    //hitung total gaji
    totGaji=gajiPokok+tunjTransp+tunjMkn+bonus-(0.1*gajiPokok);

    System.out.println("Bonus bulanan anda adalah Rp. " +bonus);
    System.out.println("Gaji yang anda terima adlaah Rp. " +totGaji);

    sc.close();
    }
    
}
