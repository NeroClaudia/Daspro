package QuizPraktekDaspro;

import java.util.Scanner;

public class quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bikePrice = 1000000;
        double discount = 0.05;

        String[] month = {"Jan", "Feb", "Maret", "April"};

        //Sales Declaration
        double[][] sales = {
                {2, 3, 4, 6},
                {3, 3, 3, 2},
                {4, 4, 5, 5},
                {1, 3, 3, 8},
                {2, 2, 2, 2},
        };

        //Jumlah Penjualan dikali harga sepeda
        double[][] hasil = new double[sales.length][sales[0].length];

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[0].length; j++) {
                hasil[i][j] = sales[i][j] * bikePrice;
            }
        }
        for (int i = 0; i < hasil.length; i++) {
            hasil[i][1] = hasil[i][1] - (hasil[i][1] * discount);
        }

        //Setelah dikali, hasil tiap baris ditambah
        double[] totalPerBulan = new double[sales[0].length];

        for (int j = 0; j < sales[0].length; j++) {
            double total = 0;
            for (int i = 0; i < sales.length; i++) {
                total += hasil[i][j];
            }
            totalPerBulan[j] = total;
        }

        String[] name = {"Sito", "Semi", "Risma", "Vero", "Barri"};
        int menu;
        do {
            System.out.println("\n========== Monthly Sales =========");
            System.out.println("Menu:");
            System.out.println("1. Show Sales Summary");
            System.out.println("2. Show Total Sales per Month");
            System.out.println("3. Exit");

            System.out.print("Select Menu: ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.printf("%-10s", "    ");
                    for (String m : month) {
                        System.out.printf("%-12s", m);
                    }
                    System.out.println();

                    for (int i = 0; i < name.length; i++) {
                        System.out.printf("%-10s", name[i]);
                        for (int j = 0; j < sales[i].length; j++) {
                            System.out.printf("%-12s", Math.round(hasil[i][j]));
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("\nTotal Sales per Month: ");
                    for (int i = 0; i < month.length; i++) {
                        System.out.printf("%s = %.0f\n", month[i], totalPerBulan[i]);
                    }
                    break;
                case 3:
                    System.out.println("Program Terminated");
                    break;
                default:
                    System.out.println("Menu Not Available");
            }

        }while(menu != 3);
    }
}
