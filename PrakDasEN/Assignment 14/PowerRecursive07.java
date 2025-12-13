import java.util.Scanner;

public class PowerRecursive07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Base Number: ");
        int base = scanner.nextInt();
        System.out.print("Input Power Number: ");
        int power = scanner.nextInt();

        System.out.println("Result of " + base + " power " + power + " = " + calculatePower(base, power));
        scanner.close();
    }
    static int calculatePower(int base, int pow) {
        if (pow == 0)
            return 1;
        else
            return base * calculatePower(base, pow - 1);
    }
}
