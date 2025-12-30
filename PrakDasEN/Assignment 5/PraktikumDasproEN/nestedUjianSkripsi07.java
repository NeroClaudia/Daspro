import java.util.Scanner;

public class nestedUjianSkripsi07 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    String message;

    System.out.println("Has the student been cleared of compensation? (Y/T or Yes/No): ");
    String compensationStatus = sc.nextLine().trim();

    System.out.println("Enter the number of guidance logs with Supervisor 1: ");
    int supervisor1 = sc.nextInt();
    System.out.println("Enter the number of guidance logs with Supervisor 2: ");
    int supervisor2 = sc.nextInt();
    
    if (compensationStatus.equalsIgnoreCase("Ya")) {
        if (supervisor1 >= 8 && supervisor2 >= 4) {
            message = "All requirements are met. The student may register for the thesis exam.";
        }else if (supervisor1 < 8 && supervisor2 < 4) {
            message = "Failed: Guidance logs with supervisor 1 are fewer than 8 and supervisor 2 fewer than 4";
        }
        else if (supervisor1 < 8 && supervisor2 >= 4) {
            message = "Failed: Guidance logs with Supervisor 1 are fewer than 8.";
        }else if (supervisor1 >= 8 && supervisor2 < 4) {
            message = "Failed: Guidance logs with supervisor 2 are fewer than 4.";
        }
        else {
            message = "Failed: The student has not been cleared of compensation.";
            sc.close();
        }
        System.out.println(message);
    }
    }
}
