import java.util.Scanner;

public class linearSearch07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of array elements: ");
        int input = sc.nextInt();

        int[] arrayInt = new int[input];
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Enter the array element " + i + ": ");
            arrayInt[i] = sc.nextInt();
        }
        int result = -1;

        System.out.print("Search the key you want: ");
        int key = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                result = i;
                break;
            }
        }
        if (result == -1) {
            System.out.println("Key Not Found");
        }else {
            System.out.printf("\nThe key in the array is located at index position %s", result);
        }
        sc.close();
    }
}
