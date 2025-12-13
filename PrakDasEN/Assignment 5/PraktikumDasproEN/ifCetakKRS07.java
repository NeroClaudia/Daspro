import java.util.Scanner;

public class ifCetakKRS07 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("--- Print KRS SIAKAD ---");
    System.out.println("Have the tuition fees been paid in full? (True/False): ");
    boolean uktlunas = sc.nextBoolean();
    
    String result = uktlunas ? "UKT payment has been verified\nKRS now can be printed and you can ask the academic advisor to sign it." : "Registration rejected. Please pay UKT first.";
    sc.close();
    System.out.println(result);
    }
    
}