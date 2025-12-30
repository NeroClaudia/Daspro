import java.util.Scanner;

public class ProvitRecursive07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Balance: ");
        double initialBalance = scanner.nextDouble();
        System.out.print("Input Invesment Period: ");
        int investPeriod = scanner.nextInt();

        System.out.println("Balance after "+ " year = " + calculateProfit(initialBalance, investPeriod));
        scanner.close();
    }
    static double calculateProfit(double balance, int period) {
        if (period == 0)
            return balance;
        else
            return 1.11 * calculateProfit(balance, period - 1);
    }
}
