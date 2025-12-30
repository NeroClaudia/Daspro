import java.util.Scanner;

public class jobsheet5task2 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Determine the number is it Even or Odd");
    System.out.println("Input the number");
    int number = sc.nextInt();

    if (number % 2 == 0) {
        System.out.println("The number is Even");
    }else {
        System.out.println("The number is Odd");
    }
    sc.close();
    }
}
