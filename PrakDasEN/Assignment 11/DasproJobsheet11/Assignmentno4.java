package DasproJobsheet11;
import java.util.*;
public class Assignmentno4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sports = {"Badminton", "Table Tennis", "Basketball", "Volleyball"};

        Map<String, ArrayList<String>> athleteData = new LinkedHashMap<>();

        System.out.println("===== PORSENI NATIONAL EVENT =====");
        for (String c : sports) {
            ArrayList<String> athleteList = new ArrayList<>();
            System.out.println("Input 5 Atlet Name for " + c + ": ");
            for (int i = 1; i <= 5; i++) {
                System.out.print("Athlete number-" + i + ": ");
                String name = sc.nextLine();
                athleteList.add(name);
            }
            Collections.sort(athleteList);
            athleteData.put(c, athleteList);
        }
        System.out.println("===== Atlet List =====");
        for (String c : athleteData.keySet()) {
            System.out.print("Cabang " + c + ": ");
            for (String name : athleteData.get(c)) {
                System.out.println("- " + name);
            }
        }
        sc.close();
    }
}