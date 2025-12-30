import java.util.Scanner;

public class arrayAverageScore07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] score = new int[10];
        double totalPassed = 0;
        double totalFailed = 0;
        int countPassed = 0;
        int countFailed = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student score " + (i + 1) + ": ");
            score[i] = sc.nextInt();

            if (score[i] > 70) {
                System.out.println("Passed");
                totalPassed += score[i];
                countPassed++;
            } else {
                System.out.println("Not Passed");
                totalFailed += score[i];
                countFailed++;
            }
        }

        double avgPassed = (countPassed > 0) ? totalPassed / countPassed : 0;
        double avgFailed = (countFailed > 0) ? totalFailed / countFailed : 0;

        System.out.printf("\nThe average score of students who passed: %.2f", avgPassed);
        System.out.printf("\nThe average score of students who failed: %.2f", avgFailed);

        sc.close();
    }
}
