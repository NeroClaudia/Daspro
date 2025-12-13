package utsDaspro;
import java.util.Scanner;
public class turu2 {

    // Fungsi untuk menentukan nilai huruf per mata kuliah
    public static String getGrade(double score) {
        if (score >= 80) return "A";
        else if (score >= 73) return "B+";
        else if (score >= 65) return "B";
        else if (score >= 60) return "C+";
        else if (score >= 50) return "C";
        else if (score >= 39) return "D";
        else return "E";
    }

    // Fungsi untuk menentukan status per mata kuliah
    public static String getStatus(double score) {
        return (score >= 60) ? "Lulus" : "Tidak Lulus";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("NIM: ");
        String nim = sc.nextLine();

        // Mata Kuliah 1
        System.out.println("--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Input Midterm Score: ");
        double midterm = sc.nextDouble();
        System.out.print("Input Final Semester Exam Score: ");
        double finalSemester = sc.nextDouble();
        System.out.print("Input Assignment Score: ");
        double assignment = sc.nextDouble();
        double finalScore1 = (midterm * 0.3) + (finalSemester * 0.4) + (assignment * 0.3);

        // Mata Kuliah 2
        System.out.println("--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Input Midterm Score: ");
        double midterm2 = sc.nextDouble();
        System.out.print("Input Final Semester Exam Score: ");
        double finalSemester2 = sc.nextDouble();
        System.out.print("Input Assignment Score: ");
        double assignment2 = sc.nextDouble();
        double finalScore2 = (midterm2 * 0.3) + (finalSemester2 * 0.4) + (assignment2 * 0.3);

        // Nilai huruf per mata kuliah
        String grade1 = getGrade(finalScore1);
        String grade2 = getGrade(finalScore2);

        // Status per mata kuliah
        String status1 = getStatus(finalScore1);
        String status2 = getStatus(finalScore2);

        // Rata-rata
        double average = (finalScore1 + finalScore2) / 2;

        // Status semester
        String statusSemester = (finalScore1 >= 60 && finalScore2 >= 60) ? "Lulus" : "Tidak Lulus";

        // Cetak tabel
        System.out.println("================== HASIL PENILAIAN AKADEMIK ==================");
        System.out.println("Nama: " + name);
        System.out.println("NIM: " + nim);
        System.out.println();
        System.out.println("Mata Kuliah\t\tUTS\t\tUAS\t\tTugas\t\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.printf("Algoritma Pemrograman\t%.0f\t\t%.0f\t\t%.0f\t\t%.2f\t\t%s\t\t%s\n", 
                          midterm, finalSemester, assignment, finalScore1, grade1, status1);
        System.out.printf("Struktur Data\t\t%.0f\t\t%.0f\t\t%.0f\t\t%.2f\t\t%s\t\t%s\n", 
                          midterm2, finalSemester2, assignment2, finalScore2, grade2, status2);
        System.out.println();
        System.out.printf("Rata-Rata Nilai Akhir: %.2f\n", average);
        System.out.println("Status Semester: " + statusSemester);

        sc.close();
    }
}
