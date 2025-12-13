import java.util.Scanner;
public class yes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Bicycle Price and Discound
        double bikePrice = 1000000;
        double discount = 0.05;
        int menu;
        //Array Declaration
        String[] months = {"Jan", "Feb", "Maret", "April"};

        String[] names = {"Sito", "Semi", "Risma", "Vero", "Barri"};

        double[][] sales = {
            {2, 3, 4, 6},
            {3, 3, 3, 2},
            {4, 4, 5, 5},
            {1, 3, 3, 8},
            {2, 2, 2, 2}
        };
        //Count the total income
        double[][] result = new double[sales.length][sales[0].length];
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[0].length; j++) {
                result[i][j] = sales[i][j] * bikePrice;
            }
        }
        //February Discount
        for (int i = 0; i < sales.length; i++) {
            result[i][1] -= (result[i][1] * discount);
        }
        //Total of all income
        double[] totalPerMonth = new double[sales[0].length];
        for (int i = 0; i < sales.length; i++) {
            double total = 0;
            for (int j = 0; j < sales[0].length; j++) {
                total += result[i][j];
            }
            totalPerMonth[i] = total;
        }
        //Menu
        System.out.println("Menu:");
        System.out.println("1. Tampilkan Rekap Penjualan");
        System.out.println("2. Tampilkan Total Penjualan Perbulan");
        System.out.println("3. Exit");

        System.out.print("Pilih Menu: ");
        menu = sc.nextInt();
        
        switch (menu) {
            case 1:
                System.out.printf("%-10s", "    ");
                for (String m : months) {
                    System.out.printf("%-12s", m);
                }
                System.out.println();

                for (int i = 0; i < sales.length; i++) {
                    System.out.printf("%-10s", names[i]);
                    for (int j = 0; j < sales[0].length; j++) {
                        System.out.printf("%-12s", Math.round(result[i][j]));
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("\nTotal Sales Per Month:");
                for (int i = 0; i < months.length; i++) {
                    System.out.printf("%s = %.0f", months[i], totalPerMonth[i]);
                }
                break;
            case 3:
                System.out.println("Programm Terminated");
                break;
            default:
                System.out.println("Menu Not Available");
        }

    }
}
