package javaFolder;
import java.util.Scanner;

public class looping5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            int jumlah = 0;

            for (int j = 1; j <= i; j++) {
                int kuadrat = j * j;
                jumlah += kuadrat;

                // Menampilkan bentuk j*j disusun seperti 1 + 4 + 9 ...
                System.out.print(kuadrat);
                if (j < i) {
                    System.out.print(" + ");
                }
            }

            System.out.println(" = " + jumlah);
        }

        input.close();
    }
}
