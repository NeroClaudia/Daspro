import java.util.Scanner;
public class studentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalPass = 0;
        double totalNotPass = 0;
        double averagePass = 0;
        double averageNotPass = 0;
        int pass = 0;
        int notPass = 0;

        System.out.print("Enter the number of students: ");
        int jmlMahasiswa = sc.nextInt();

        int[] stdGrade = new int[jmlMahasiswa];

        for (int i = 0; i < stdGrade.length; i++) {
            System.out.print("Enter grade student " + (i + 1) + " : ");
            stdGrade[i] = sc.nextInt();

            if (stdGrade[i] > 70) {
                pass++;
                totalPass += stdGrade[i];
            }else {
                notPass++;
                totalNotPass += stdGrade[i];
            }
        }
        averagePass = totalPass / pass;
        averageNotPass = totalNotPass / notPass;
        System.out.println("========================================");
        System.out.println("Number of students who graduated: " + pass);
        System.out.println("Number of students who did not pass: " + notPass);
        System.out.println("========================================");
        System.out.printf("Average passing grade: %.2f\n", averagePass);
        System.out.printf("Average grade not passing: %.2f", averageNotPass);
        sc.close();
    }
}