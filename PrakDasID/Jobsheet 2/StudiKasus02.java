import java.util.Scanner;

public class StudiKasus02 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    //Luas tanah total
    
    System.out.println("Masukkan nilai panjang (m)");
    double panjang = sc.nextDouble();

    System.out.println("Masukkan nilai lebar (m)");
    double lebar = sc.nextDouble();

    //Jumlah kolam lingkaran

    System.out.println("Masukkan jumlah kolam lingkaran");
    int jml_lingkaran = sc.nextInt();

    System.out.println("Masukkan diameter (m)");
    double diameter = sc.nextDouble();
    double r = diameter / 2;

    //Jumlah kolam persegi

    System.out.println("Masukkan jumlah kolam persegi");
    int jml_kolamPersegi = sc.nextInt();

    System.out.println("Masukkan nilai sisi (m)");
    double sisi = sc.nextDouble();

    //Hitung luas tanah 

    double luasTanah = panjang * lebar;
    
    //Hitung luas semua kolam

    double luasLingkaran = jml_lingkaran + (Math.PI * r * r);
    double luasPersegi = jml_kolamPersegi + (sisi * sisi);
    double totalKolam = luasLingkaran + luasPersegi;

    //Luas rumput

    double  luasRumput = luasTanah - totalKolam;

    //output

    System.out.println("\n=== HASIL PERHITUNGAN ===");
    System.out.println("Luas Tanah " + luasTanah + "m²");
    System.out.println("Luas kolam total " + totalKolam + "m²");
    System.out.println("Luas rumput " + luasRumput + "m²");

        sc.close();
    
    }
    
}
