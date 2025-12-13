import java.util.Scanner;
public class parking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int type, duration, total = 0;
        int i = 1;

    do {
        System.out.printf("=== vehicle %d === \n", i);
        System.out.print("Vehicle Type: ");
        type = sc.nextInt();

        if (type == 1 || type == 2) {
            System.out.print("Input your parking duration (hour): ");
            duration = sc.nextInt();

            if (duration > 5) {
                total += 12500;
            }
            else if (type == 1) {
                total += duration * 3000;
            }
            else if (type == 2) {
                total += duration * 2000;
            }

        } else if (type == 0) {
        break;
        }
        
        else {
        System.out.println("Vehicle Type Is Not Found. Please Input Again");
        continue;
        }
        
        i++;
    
    } while (true);
    
    System.out.println("Total (Rp): " + total);
    sc.close();
    } 
}
