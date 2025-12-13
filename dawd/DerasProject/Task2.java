package DerasProject;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int type, duration, total = 0;
        int i = 1;

        System.out.println("=== Vehicle Code Type ===");
        System.out.println("1. Car\n2. Motor\n0. Exit\n");
        
        do {  
        System.out.printf("=== %d Customer ===\n", i);
        System.out.print("Input your vehicle type (number): ");
        type = sc.nextInt();

            if (type == 1 || type == 2) {
                System.out.print("Input your park duration (hour): ");
                duration = sc.nextInt();
                if (duration < 0) {
                    System.out.println("Duration invalid. Please input again");
                    continue;
                }

                if (duration > 5) {
                    total += 12500;
                } else if (type == 1) {
                    total += duration * 3000;
                } else if (type == 2) {
                    total += duration * 2000;
                }

            } else if (type == 0) {
                break;

            } else {
                System.out.println("Your vehicle type is not found. Please input again.");
                continue;
            }

            i++;
        } while (true);

        System.out.println("Total parking price today: Rp " + total);
        sc.close();
    }
}