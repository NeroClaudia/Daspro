import java.util.Scanner;
public class KafeDoWhile07 {
    public static void main(String[] args) {
       
    Scanner sc = new Scanner(System.in);

    int coffee, tea, bread;
    String customerName;
    double coffeePrice = 12000;
    double teaPrice = 7000;
    double breadPrice = 20000;

    do {
        
        System.out.print("Enter Customer Name (type 'cancel' to exit): ");
        customerName = sc.nextLine();

        if (customerName.equalsIgnoreCase("cancel")) {
            System.out.println("Transaction Canceled");
            break;
        }
        System.out.print("Number of coffees: ");
        coffee = sc.nextInt();
        System.out.print("Number of teas: ");
        tea = sc.nextInt();
        System.out.print("Number of breads: ");
        bread = sc.nextInt();
        
        double total = (coffee * coffeePrice) + (tea * teaPrice) + (bread * breadPrice);
        
        System.out.println("Payment amount: Rp " + total);
        sc.nextLine();
    }while(true);
    System.out.println("All transaction clear");
    sc.close();
    }

}
