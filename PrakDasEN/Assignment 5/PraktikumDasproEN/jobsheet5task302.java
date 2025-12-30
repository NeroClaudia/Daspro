import java.util.Scanner;

public class jobsheet5task302 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("FREE WIFI");
    System.out.println("User Type? (Lecturer or Student)");
    String userType = sc.nextLine().trim().toLowerCase();

    switch (userType) {
        case "lecturer":
        System.out.println("Wifi Access Granted");
        break;

        case "student":
        System.out.println("How many credits you have taken?");
        int credit = sc.nextInt();

        if (credit >= 12) {
            System.out.println("Wifi Access Granted (Active Student)");
        }else if (credit <= 12) {
            System.out.println("Access denied, credit less than 12");
        }else {
            System.out.println("Access Denied");
        }
        sc.close();
    } 
    }
    }

