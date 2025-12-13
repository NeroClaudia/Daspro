package DasproJobsheet11;
import java.util.Scanner;
public class Assignmentno2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input x: ");
        int x = sc.nextInt();

    for (int i = 1; i <= x; i++) {
        for (int j = 0; j <= x - i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    sc.close();
    }
}
