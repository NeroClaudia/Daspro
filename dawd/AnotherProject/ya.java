import java.util.InputMismatchException;
import java.util.Scanner;

public class ya {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        try {
            System.out.print("Masukkan usia anda: ");
            int age = scanner.nextInt();
            System.out.println("Usia anda adalah: " + age);
        }
        catch (InputMismatchException e) {
            System.out.println("Input tidak valid! Harap masukkan angka");
        }
        scanner.close();
    }
}
