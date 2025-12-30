import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Insert Kilometer");
    int kilometer = sc.nextInt();
    double fuelPrice = 10000;
    double fuelConsume = kilometer / 2;
    
    double totalFuel = fuelPrice * fuelConsume;
    System.out.println("Total total fuel cost " + totalFuel);

    sc.close();
    }
}
