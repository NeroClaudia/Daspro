package DerasProject;

import java.util.Scanner;
public class Task1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        int ticketPrice = 50000;
        int ticket, i = 1, totalTicket = 0;
        float dicount, totalPrice;
        float totalSellPrice = 0;
        String name;

        System.out.println("=== Ticket Price ===");
        System.out.println("Ticket: Rp 50000\nPurchases over 4: get 10% discount\nPurchases over 10: get 15% discount\n");

        do {
            System.out.printf("=== %d Customer ===\n", i);
            System.out.printf("Input your name (Type 'done' to exit): ");
            name = sc.next().toLowerCase();
            
            if (name.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter the ticket purchase amount: ");
            ticket = sc.nextInt();

            if (ticket < 0) {
                System.out.println("Input invalid. Please input the correct number!");
                continue;
            } else if (ticket > 4) {
                dicount = 0.1f;
            } else if (ticket > 10) {
                dicount = 0.15f;
            } else {
                dicount = 0;
            }

            i++;

            totalTicket += ticket;
            totalPrice = ticketPrice * ticket * (1 - dicount);

            System.out.println("The total of ticket price is: Rp " + totalPrice);

            totalSellPrice += totalPrice;

        } while (true);

        System.out.printf("\nTotal ticket sales today: %d ticket\n", totalTicket);
        System.out.println("Total nominal sales today: Rp " + totalSellPrice);

        sc.close();
    }
}