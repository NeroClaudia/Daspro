import java.util.Scanner;
public class ExpressingGratitude_07 {
    static String getGreetingRecipient() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = sc.nextLine();
        sc.close();
        return recipientName;
    }
    static void sayThankyou() {
        String name = getGreetingRecipient();
        System.out.println("Thank you " + name + " for being the best teacher in the world.\n" + "You inspired in me a love for learning and made me feel like I could ask you anything.");
        sayAdditionalGreetings("No one knows what the future holds, that's why it's potential is infinite");
    }
    static void sayAdditionalGreetings(String input) {
        System.out.println("\nAdditional Greeting:");
        System.out.println(input);
    }
    public static void main(String[] args) {
        
        sayThankyou();
    }
}
