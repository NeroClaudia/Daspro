import java.util.Scanner;

public class PakAli {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    //input

    System.out.println("Motorcycle price");
    double motorPrice = sc.nextDouble();
    System.out.println("Down payment");
    double downPayment = sc.nextDouble();
    double interest = 0.01;
    System.out.println("Long Installment");
    double installment= sc.nextInt();

    //Calculate

    double residual = motorPrice - downPayment;
    double totalInterest = interest * residual * installment;
    double totalPayment = totalInterest / installment;

    System.out.println("Total Payment " + totalPayment);

    sc.close();
    }
}
