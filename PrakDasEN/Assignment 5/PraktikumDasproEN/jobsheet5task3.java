import java.util.Scanner;

 public class jobsheet5task3 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("==== Campus Library System ====");
    System.out.println("Are you bring your studen ID? (True/False)");
    boolean studenId = sc.nextBoolean();

    if (studenId == true) {
        System.out.println("Welcome To The Library!");
    }else if (studenId == false) {
        System.out.println("Have you registered online? (True/False)");
        boolean regOnline = sc.nextBoolean();
    
        if (regOnline == true) {
            System.out.println("Welcome To The Library!");
        }else {
            System.out.println("You're not allowed to enter");
        }
        sc.close();
    }
    }
 }