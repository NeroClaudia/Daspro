package javaFolder;

import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Java Bank System
        double balance = 0;
        int choice;
        double withdraw;
        double depo;

        do {
            System.out.println("========= BANKING SYSTEM ========");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdrawal");
            System.out.println("4. Exit");
            System.out.println("==================================");

            System.out.print("Input Your Choice (1-4): ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.printf("Balance: %s$\n", showBalance(balance));
                    continue;
                case 2:
                    System.out.print("Enter how much you want to deposit: ");
                    depo = sc.nextDouble();
                    balance = depositInput(balance, depo);
                    continue;
                case 3:
                    System.out.print("Enter how much you want to withdraw: ");
                    withdraw = sc.nextDouble();
                    balance = withdrawInput(balance, withdraw);
                    continue;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }while(choice != 4);
        sc.close();
    }
    static double showBalance(double balance) {
        return balance;
    }
    static double depositInput(double balance, double depo) {
        return balance + depo;
    }
    static double withdrawInput(double balance, double withdraw) {
        return balance - withdraw;
    }
    static String exit() {
        return "Thank You";
    }
}