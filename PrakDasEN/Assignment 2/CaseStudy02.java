import java.util.Scanner;

public class CaseStudy02 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    //Input and output

    //Mr. Jaka land

    System.out.println("Input wide (m)");
    double w = sc.nextDouble();

    System.out.println("Input long (m)");
    double length = sc.nextDouble();

    //Calculate Mr. Jaka land

    double totalLand = w * length;

    //Circle pond

    System.out.println("Input circle diameter");
    double diameter = sc.nextDouble();
    double r = diameter / 2;

    //Calculate the circle pond

    double circle_area = Math.PI * r * r;

    //Square pond

    System.out.println("Input square length (m)");
    double l = sc.nextDouble();

    //Calculate the square pond

    double square_area = l * l;

    //Total remaining land
    
    double remainingLand = totalLand - (circle_area + square_area);
    System.out.println("Total remaining land that planted grass (m²) " + remainingLand);

    sc.close();

    }
}
