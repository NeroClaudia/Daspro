package projectJava;
import java.util.Scanner;
public class calculator {

    public static void print (String print) {
        System.out.println(print);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    double firstNum, secondNum;
    double result;
    char op;
    String repeat;
    print("========== SIMPLE CALCULATOR ==========");

    do {
        System.out.print("Input First Number: ");
        firstNum = sc.nextDouble();
        System.out.print("Input Operator (+, -, *, /): ");
        op = sc.next().charAt(0);
        System.out.print("Input Second Number: ");
        secondNum = sc.nextDouble();

        if (op == '+') {
            result = firstNum + secondNum;
            System.out.println("Result: " + Math.round (result));
        }else if (op == '-') {
            result = firstNum - secondNum;
            System.out.println("Result: " + Math.round (result));
        }else if (op == '*') {
            result = firstNum * secondNum;
            System.out.println("Result: " + Math.round (result));
        }else if (op == '/') {
            result = firstNum / secondNum;
            System.out.println("Result: " + Math.round (result));
            if (secondNum == 0) {
                System.out.println("Can't Devide by Zero!");
            }else {
                result = firstNum / secondNum;
                System.out.println("Result: " +  Math.round (result));
            }
        }else {
            System.out.println("Invalid Operator!");
        }
        System.out.print("Wanna Try Again (Yes/No): ");
        repeat = sc.next();

    }while(repeat.equalsIgnoreCase("yes"));
    
    System.out.println("Thank You!");
    sc.close();
    }
}