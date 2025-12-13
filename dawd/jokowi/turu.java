package jokowi;
import java.util.Scanner;
public class turu {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Input Student Data
    System.out.println("===== INPUT STUDENT DATA =====");
    System.out.print("Name: ");
    String name = sc.nextLine();

    System.out.print("NIM: ");
    String nim = sc.nextLine();
    
    //Input Course 1 Score
    System.out.println("--- Course 1: Algorithms and Programming ---");

    System.out.print("Input Midterm Score: ");
    double midterm = sc.nextDouble();
    
    System.out.print("Input Final Semester Exam Score: ");
    double finalSemester = sc.nextDouble();

    System.out.print("Input Assignment Score: ");
    double assignment = sc.nextDouble();

    double finalScore1 = (midterm * 0.3) + (finalSemester * 0.4) + (assignment * 0.3);
    
    //Input Course 2 Score
    System.out.println("--- Course 2: Data Structures ---");
    
    System.out.print("Input Midterm Score: ");
    double midterm2 = sc.nextDouble();

    System.out.print("Input Final Semester Exam Score: ");
    double finalSemester2 = sc.nextDouble();

    System.out.print("Input Assignment Score: ");
    double assignment2 = sc.nextDouble();

    double finalScore2 = (midterm2 * 0.3) + (finalSemester2 * 0.4) + (assignment2 * 0.3);

    //Average
    double average;
    average = (finalScore1 + finalScore2) / 2;
    
    //FinalScore Course 1
    String grade1, grade2;
    if (finalScore1 > 80) grade1 = "A";
    else if (finalScore1 >= 73) grade1 = "B+";
    else if (finalScore1 >= 65) grade1 = "B";
    else if (finalScore1 >= 60) grade1 = "C+";
    else if (finalScore1 >= 50) grade1 = "C";
    else if (finalScore1 >= 39) grade1 = "D";
    else grade1 = "E";
    
    //FinalScore Course 2
    if (finalScore2 > 80) grade2 = "A";
    else if (finalScore2 >= 73) grade2 = "B+";
    else if (finalScore2 >= 65) grade2 = "B";
    else if (finalScore2 >= 60) grade2 = "C+";
    else if (finalScore2 >= 50) grade2 = "C";
    else if (finalScore2 >= 39) grade2 = "D";
    else grade2 = "E";
    
    //Status
    String status1, status2;
        if (finalScore1 >= 60) {
    status1 = "PASSED";
    }   else {
    status1 = "NOT PASSED";
    }
        if (finalScore2 >= 60) {
    status2 = "PASSED";
    }   else {
    status2 = "NOT PASSED";
    }


    String statusSemester = (average >= 70) ? "PASSED" : "NOT PASSED (Score < 70)";

    //Output
    System.out.println("================== ACADEMIC ASSESSMENT RESULTS ==================");
    System.out.println("Name: " + name);
    System.out.println("NIM: " + nim);
    System.out.println("");
    System.out.println("Subject\t\tMidterm Test\t\tFinal Exam\tAssignment\tFinal Score\tLetter Grade\tStatus");
    System.out.println("-------------------------------------------------------------------------------------------------------------------");
    System.out.print("Programming Algorithm\t");
    System.out.print((int) midterm + "\t\t");
    System.out.print((int) finalSemester + "\t\t");
    System.out.print((int) assignment + "\t\t");
    System.out.print((int) finalScore1 + "\t\t");
    System.out.print(grade1 + "\t\t");
    System.out.println(status1);
    System.out.print("Data Structure\t\t");
    System.out.print((int) midterm2 + "\t\t");
    System.out.print((int) finalSemester2 + "\t\t");
    System.out.print((int) assignment2 + "\t\t");
    System.out.print((int) finalScore2 + "\t\t");
    System.out.print(grade2 + "\t\t");
    System.out.println(status2);
    System.out.println("");
    System.out.println("Average Final Score: " + (int) average);
    System.out.println("Semester Status: " + statusSemester);
    sc.close();
    }

    }

 