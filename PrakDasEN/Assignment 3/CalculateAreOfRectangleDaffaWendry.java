import java.util.Scanner;

public class CalculateAreOfRectangleDaffaWendry {
    public static void main(String[] args) {
        
    Scanner ye = new Scanner(System.in);
    
    int length;
    int width;
    int area;

    System.out.println("Enter the length of rectangle");
    length = ye.nextInt();
    System.out.println("Enter the width of rectangle");
    width = ye.nextInt();
   
    area = length * width;
    System.out.println("The are of rectangele " + area);

    ye.close();
    }
    
}
