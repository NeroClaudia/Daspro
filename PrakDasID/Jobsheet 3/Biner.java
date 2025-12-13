import java.util.Scanner;

public class Biner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        // Input angka pertama
        System.out.print("Masukkan angka pertama: ");
        angka1 = sc.nextDouble();

        // Input operator
        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = sc.next().charAt(0);

        // Input angka kedua
        System.out.print("Masukkan angka kedua: ");
        angka2 = sc.nextDouble();

        // Proses sesuai operator
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                }
                break;
            default:
                System.out.println("Operator tidak valid.");
                break;
        }

        sc.close();
    }
}
