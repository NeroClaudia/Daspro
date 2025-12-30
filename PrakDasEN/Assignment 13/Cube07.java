import java.util.Scanner;

public class Cube07 {
    static double calculateArea (double sisi) {
        double area = 6 * (Math.pow(sisi, 2));
        return area;
    }
    static double calculateVolume (double sisi) {
        double volume = Math.pow(sisi, 3);
        return volume;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== MENGHITUNG AREA DAN VOLUME KUBUS =====");
        System.out.print("Input Panjang Sisi: ");
        int sisi = sc.nextInt();

        double area = calculateArea(sisi);
        double volume = calculateVolume(sisi);

        System.out.println("Area of the cube: " + area);
        System.out.println("Volume of the cube: " + volume);
        sc.close();
    }
}