package DerasProject;

import java.util.Scanner;
public class KafeDoWhile8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int coffe, tea, bread, totalPrice;
        String customerName;
        int coffePrice = 12000,
            teaPrice = 7000,
            breadPrice = 20000;

        do {
            System.out.print("Enter customer name (Type 'cancel' to exit) ");
            customerName = sc.nextLine().toLowerCase();
        
            if (customerName.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction canceled.");
                break;
            }

            System.out.print("Number of coffes: ");
            coffe = sc.nextInt();
            System.out.print("Number of teas: ");
            tea = sc.nextInt();
            System.out.print("Number of breads: ");
            bread = sc.nextInt();
            
            totalPrice = (coffe * coffePrice) + (tea * teaPrice) + (bread * breadPrice);
            System.out.println("Total to be paid: Rp " + totalPrice);
            sc.nextLine();
        } while (true);

        System.out.println("All transactions complete.");
        sc.close();
    }
}