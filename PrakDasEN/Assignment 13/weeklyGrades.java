import java.util.Scanner;

public class weeklyGrades {
    static Scanner scanner = new Scanner(System.in);

    static String[] names;
    static int[][] grades;
    static int studentCount;
    static int weekCount;

    public static void main(String[] args) {

        System.out.print("Input How Many Students: ");
        studentCount = scanner.nextInt();

        System.out.print("Input How Many Weeks: ");
        weekCount = scanner.nextInt();
        scanner.nextLine();

        names = new String[studentCount];
        grades = new int[studentCount][weekCount];

        inputGrades();
        displayGrades();
        findWeekWithHighestGrades();
        findTopStudent();
    }

    // Method Input Student Names and Grades
    public static void inputGrades() {
        System.out.println("\n======== INPUT STUDENT NAMES AND GRADES ========");

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Enter Student " + (i + 1) + " Name: ");
            names[i] = scanner.nextLine();
        }

        for (int i = 0; i < studentCount; i++) {
            System.out.println("Enter grades for " + names[i] + ":");

            for (int j = 0; j < weekCount; j++) {
                System.out.print("  Week " + (j + 1) + ": ");
                grades[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
    }

    // Method Display Grades
    public static void displayGrades() {
        System.out.println("\n================ ALL STUDENT GRADES ================\n");

        System.out.printf("%-15s", "Name");
        for (int w = 0; w < weekCount; w++) {
            System.out.printf("%-10s", "W" + (w + 1));
        }
        System.out.println();

        for (int i = 0; i < studentCount; i++) {
            System.out.printf("%-15s", names[i]);

            for (int j = 0; j < weekCount; j++) {
                System.out.printf("%-10d", grades[i][j]);
            }
            System.out.println();
        }
    }

    // Method Finding the highest grade in a week
    public static void findWeekWithHighestGrades() {
        int highest = grades[0][0];
        int weekIndex = 0;

        for (int w = 0; w < weekCount; w++) {
            for (int s = 0; s < studentCount; s++) {
                if (grades[s][w] > highest) {
                    highest = grades[s][w];
                    weekIndex = w;
                }
            }
        }

        System.out.println("\n===== WEEK WITH THE HIGHEST GRADE =====");
        System.out.println("Highest Grade: " + highest);
        System.out.println("Occurred in Week " + (weekIndex + 1));
    }

    // Method Finding top student
    public static void findTopStudent() {
        int highest = grades[0][0];
        int studentIndex = 0;

        for (int i = 0; i < studentCount; i++) {
            for (int w = 0; w < weekCount; w++) {
                if (grades[i][w] > highest) {
                    highest = grades[i][w];
                    studentIndex = i;
                }
            }
        }

        System.out.println("\n===== STUDENT WITH HIGHEST GRADE =====");
        System.out.println(names[studentIndex] + " has the highest grade: " + highest);

        System.out.println("Weekly Grades:");
        for (int w = 0; w < weekCount; w++) {
            System.out.println("  Week " + (w + 1) + ": " + grades[studentIndex][w]);
        }
    }
}
