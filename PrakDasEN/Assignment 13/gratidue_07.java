import java.util.Scanner;
public class gratidue_07 {

    static void sayThankyou() {
        System.out.println("Thank you for being the best teacher in the world.\n" + "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }
    static void sayAdditionalGreeting(String greeting) {
        System.out.println(greeting);
    }
    static String getGreetingRecipient() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = sc.nextLine();
        sc.close();
        return recipientName;
    }
    public static void main(String[] args) {
        String name = getGreetingRecipient();
        System.out.println("Thank you "+name+" May the force be with you!");
    }
}
