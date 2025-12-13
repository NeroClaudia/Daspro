import java.util.Scanner;
public class SiakadFor07 {
    
    public static void print (String cetak) {
        System.out.print(cetak);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    double grade, highest = 0, lowest = 100;

    for (int i = 1; i <= 10; i++) {
        print("Enter the grade of the " + i + " student: ");
        grade = sc.nextDouble();

    if (grade > highest)
        highest = grade;
        if (grade < lowest)
            lowest = grade;
    }
    System.out.println("The highest grade: " + highest);
    System.out.println("The lowest grade: " + lowest);
    sc.close();
    }
}