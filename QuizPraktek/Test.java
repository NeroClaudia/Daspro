import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    //Input the activities
    
    System.out.println("Input the weight (Kg)");
    double weight = sc.nextDouble();
    System.out.println("Input the Average Speed (km/h)");
    double averageSpeed = sc.nextDouble();
    System.out.println("Input the Training Altitude (m)");
    double trainingAltitude = sc.nextDouble();
    System.out.println("Input the duration (minute)");
    double duration = sc.nextDouble();
    System.out.println("Input target calories");
    double targetCalories = sc.nextDouble();

    //Calculate and display of each calories
    
    
    double runCalories = (duration * 0.05 * weight) + (averageSpeed * 0.5) + (trainingAltitude * 0.01);
    System.out.println("Total Running Calories " + (int) runCalories);
    double swimCalories = (duration * 0.04 * weight) + (averageSpeed * 0.5) + (trainingAltitude * 0.01);
    System.out.println("Total Swimming Calories " + (int) swimCalories);
    double cyCalories = (duration * 0.03 * weight) + ( averageSpeed * 0.5) + ( trainingAltitude * 0.01);
    System.out.println("Total Cycling Calories " + (int) cyCalories);

    //Total all calories

    double totalCalories = runCalories + swimCalories + cyCalories;
    System.out.println("Total Calories is " + (int) totalCalories);

    //Total average calories burned per minute

    double averageCalories = totalCalories / duration;
    System.out.println("The average calories burned per minute is " + (int) averageCalories);

    //Percentage of all activity
    
    double totalPercentage = (totalCalories / targetCalories) * 100;
    System.out.println("Total calories of all activity " + (int) totalPercentage);


    //Percentage of each activity

    double percentageRun = (runCalories / totalCalories) * 100;
    System.out.println("Running calories percentage " + (int) percentageRun);
    double percentageSwim = (swimCalories / totalCalories) * 100;
    System.out.println("Swimming calories percentage " + (int) percentageSwim);
    double percentageCy = (cyCalories / totalCalories) * 100;
    System.out.println("Cycling calories percentage " + (int) percentageCy);

    sc.close();
    
    }
}