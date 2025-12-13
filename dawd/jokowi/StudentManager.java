package jokowi;
import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    // Tambahkan mahasiswa
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Mahasiswa berhasil ditambahkan!\n");
    }

    // Tampilkan semua mahasiswa
    public void showAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.\n");
        } else {
            System.out.println("=== Daftar Mahasiswa ===");
            for (Student s : students) {
                s.displayInfo();
            }
            System.out.println();
        }
    }
}
