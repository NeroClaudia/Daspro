package DasproJobsheet11;
import java.util.Scanner;
public class Assignmentno3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input x: ");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                if (i == 1 || i == x || j == 1 || j == x) {
                    System.out.print(x);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}