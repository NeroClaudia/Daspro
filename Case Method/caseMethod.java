import java.util.Scanner;

public class caseMethod {
    //Deklarasi memakai static karena akan dipakai di method static
    static Scanner scanner = new Scanner(System.in);
    static String[] names;
    static String[] studentId;
    static double[] gpa;
    static int[] scholarshipType;
    //Jumlah maksimal mahasiswa yang mendaftar
    static int maxApplicants;
    static int[] parentIncomes;
    //Menghitung jumlah data yang terisi
    static int currentCount = 0;

    //Main Method
    public static void main(String[] args) {
        //Header
        System.out.println("===== ACADEMIC SCHOLARSHIP REGISTRATION =====");
        System.out.print("Enter Maximum Number of Applicants: ");
        maxApplicants = scanner.nextInt();
        scanner.nextLine();
        
        names = new String[maxApplicants];
        studentId = new String[maxApplicants];
        gpa = new double[maxApplicants];
        scholarshipType = new int[maxApplicants];
        parentIncomes = new int[maxApplicants];

        //Deklarasi variable choice dan menentukan pilihan menu
        int choice;
        do {
            displayMenu();
            System.out.print("Your Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addNewApplicant();
                    break;
                case 2:
                    showAllApplicants();
                    break;
                case 3:
                    searchByScholarshipType();
                    break;
                case 4:
                    calculateAverageGpa();
                    break;
                case 0:
                    System.out.println("Thank you. Program Finished");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }while(choice != 0);
    }
    //Method Display Menu
    public static void displayMenu() {
        System.out.println("====================================");
        System.out.println("\tSCHOLARSHIP REGISTRATION");
        System.out.println("====================================");
        System.out.println("1. Add New Applicant");
        System.out.println("2. Show all Applicants");
        System.out.println("3. Show Applicants by Scholarship Type");
        System.out.println("4. Calculate Average GPA per Scholarship Type");
        System.out.println("0. Exit");
    }
    //Method New Applicant (Menu no 1)
    public static void addNewApplicant() {
        //Jika array sudah penuh, akan keluar dari method
        if (currentCount >= maxApplicants) {
            System.out.println("Maximum Applicants Reached!");
            return;
        }
        System.out.println("=== Add New Scholarship Applicant ===");
        //Input nama mahasiswa
        System.out.print("Student Name\t: ");
        names[currentCount] = scanner.nextLine(); 
        //Input student id siswa
        System.out.print("Student ID\t: ");
        studentId[currentCount] = scanner.nextLine();
        //Input GPA terakhir
        System.out.print("Latest GPA\t: ");
        gpa[currentCount] = scanner.nextDouble();
        //Input jenis beasiswa
        System.out.println("Choose Scholarship Type:");
        System.out.println("1. Regular");
        System.out.println("2. Excellent");
        System.out.println("3. Research");
        System.out.print("Input Choice (1-3): ");
        scholarshipType[currentCount] = scanner.nextInt();
        //Input pendapatan orang tua
        System.out.print("Parents' Income (Max 2000000): ");
        parentIncomes[currentCount] = scanner.nextInt();
        scanner.nextLine();
        //Jika data berhasil ditambahkan, akan disimpan di variable currentCount dan akan bertambah 1
        System.out.println(">> Applicant data has been added.");
        currentCount++;
    }
    //Method untuk tipe beasiswa
    public static String getScholarshipTypeName(int type) {
        switch (type) {
            case 1: return "Regular";
            case 2: return "Excellent";
            case 3: return "Research";
            default: return "Unknown";
        }
    }
    //Method memunculkan semua orang yang mendaftar beasiswa
    public static void showAllApplicants() {
        //Header
        System.out.println("\n=== List of All Scholarship Applicants ===");
        System.out.println("No\tName\t\t\tStudent ID\t\tGPA\tType\t\tIncome");
        System.out.println("-------------------------------------------------------------------------");
        //Loop data
        for (int i = 0; i < currentCount; i++) {
            String type = getScholarshipTypeName(scholarshipType[i]);
            System.out.printf("%d\t%-20s\t%-20s\t%.1f%13s\t%-14d\n", (i + 1), names[i], studentId[i], gpa[i], type, parentIncomes[i]);
        }
    }
    //Method untuk mencari nama pendaftar dari jenis beasiswa
    public static void searchByScholarshipType() {
        //Header
        System.out.println("\n=== Search Applicants by Scholarship Type ===");
        System.out.println("1. Regular");
        System.out.println("2. Excellent");
        System.out.println("3. Research");
        System.out.print("Input Choice (1-3): ");
        //Input pilihan beasiswa
        int searchType = scanner.nextInt();
        scanner.nextLine();
        //Header
        System.out.println("\n=== Applicant for " + getScholarshipTypeName(searchType) + " Scholarship ===");
        System.out.println("No\tName\t\t\tStudent ID\t\tGPA\tIncome");
        System.out.println("-------------------------------------------------------------------------");
        //Loop semua mahasiswa yang terdaftar
        int count = 0;
        for (int i = 0; i < currentCount; i++) {
            if (scholarshipType[i] == searchType) {
                count++;
                System.out.printf("%d\t%-20s\t%-20s\t%.1f\t%d\n", count, names[i], studentId[i], gpa[i], parentIncomes[i]);
            }
        }
        //Jika count tidak bertambah, berarti tidak ada mahasiswa yang mendaftar di beasiswa terkait
        if (count == 0) {
            System.out.println("No Applicant Found");
        }
    }
    //Method untuk menghitung rata-rata GPA tiap jenis beasiswa
    public static void calculateAverageGpa() {
        //Header
        System.out.println("\n=== Average GPA per Scholarship Type ===");
        //Loop tiap beasiswa yang disimpan di variabel type. Loop akan menghitung rata-rata untuk masing-masing tipe
        for (int type = 1; type <= 3; type++) {
            //Variabel untuk menjumlahkan GPA
            double sum = 0;
            //Penghitung jumlah mahasiswa dengan tipe tersebut
            int count = 0;
            //Loop melalui semua data mahasiswa yang sudah terdaftar
            for (int i = 0; i < currentCount; i++) {
                //Memeriksa apakah mahasiswa di index i memiliki tipe beasiswa yang sedang diproses
                if (scholarshipType[i] == type) {
                    //Tambahkan GPA mahasiswa ke total
                    sum += gpa[i];
                    //Tambah penghitung mahasiswa
                    count++;
                }
            }
            //Cek kondisi, jika tidak ada yang mendaftar di beasiswa terkait, akan muncul pesan berikut
            if (count == 0) {
                System.out.println("No Applicant for " + getScholarshipTypeName(type) + " Scholarship");
                //Jika tidak, akan langsung menghitung rata-rata nilai mahasiswa
            }else {
                double average = sum / count;
                System.out.printf("Average GPA for %s Scholarship: %.1f\n", getScholarshipTypeName(type), average);
            }
        }
    }
}