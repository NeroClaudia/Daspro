import java.util.Scanner;
public class Asu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matkul = 5;
        double nilai, rata, total = 0;
    
        for (int i = 1; i <= matkul; i++) {
            System.out.print("Masukkan nilai mata kuliah ke-" + i + ": ");
            nilai = sc.nextDouble();
            total += nilai;
        }
        rata = total / matkul;
        System.out.println("Rata-rata nilai: " + Math.round (rata));
        sc.close();
    }
}