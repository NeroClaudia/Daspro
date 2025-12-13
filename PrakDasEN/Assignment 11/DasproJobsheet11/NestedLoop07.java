package DasproJobsheet11;
import java.util.Scanner;
public class NestedLoop07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temps[i][j] = sc.nextDouble();
            }
            System.out.println();
        }
        for (int i = 0; i < temps.length; i++) {
            double total = 0;
            System.out.println("City: " + i + ": ");
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print(temps[i][j] + " ");
                total += temps[i][j];
            }
        double average = total / temps[0].length;
        System.out.printf(" | Average: %.2f", average);
        System.out.println();
        sc.close();
        }
    }
}
