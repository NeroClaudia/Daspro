package DasproJobsheet11;
import java.util.Scanner;
import java.util.Random;
public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

    char menu = 'y';
    do {
        int number = rand.nextInt(10) + 1;
        boolean success = false;
        do {
            System.out.print("Guess the number (1-10): ");
            int answer = sc.nextInt();
            sc.nextLine();
            if (success = (answer == number)) {
                System.out.println("Congratulations! The Answer is " + answer);
            }else if (answer < number) {
                System.out.println("Too Low");
            }else {
                System.out.println("Too High");
            }
        }while(!success);
        System.out.print("Do you want to repeat the game (Y/N): ");
        menu = sc.next().charAt(0);
        sc.nextLine();
    }while(menu == 'Y' || menu == 'y');
    sc.close();
    }
    
}
