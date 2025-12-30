import java.util.Scanner;

public class CaseStudy01 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    //Input

    System.out.println("Input basic salary");
    double basicSalary = sc.nextDouble();

    System.out.println("Input child you have");
    double child = sc.nextDouble();
    double childAllowance = 150000;
    double totalChildAllowance = childAllowance * child;

    double pensionSavings = 0.05;
    double total_pension_savings = pensionSavings * basicSalary;
    double total_basic_salary = basicSalary + totalChildAllowance - total_pension_savings ;

    //output

    System.out.println("Total basic salary: " + total_basic_salary);

    sc.close();
    }
    
}
