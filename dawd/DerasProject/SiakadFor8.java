package DerasProject;

import java.util.Scanner;
public class SiakadFor8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float grade, highest = 0, lowest = 100;
        int pass = 0, npass = 0;
        for (int i = 1 ; i <= 10 ; i++) {
            System.out.printf("Enter the grade of the %d students: ", i);
            grade = sc.nextFloat();

            if (grade > highest) {
                highest = grade;
            } 
            if (grade < lowest) {
                lowest = grade;
            }

            if (grade >= 60) {
                System.out.println("Status Score: Passed");
                pass++;
            } else {
                System.out.println("Status Score: Not Passed");
                npass++;
            }
        }

        System.out.println("grade highest: " + highest);
        System.out.println("grade lowest: " + lowest);

        System.out.println("Total students passed: " + pass);
        System.out.println("Total students not passed: " + npass);
        sc.close();
    }
}