import java.util.ArrayList;
import java.util.Scanner;

public class human {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println("\n=== TO-DO LIST ===");
            System.out.println("1. Tambah tugas");
            System.out.println("2. Hapus tugas");
            System.out.println("3. Lihat semua tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Masukkan tugas baru: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Tugas ditambahkan!");
                    break;
                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("Belum ada tugas.");
                    } else {
                        System.out.println("Daftar tugas:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                        System.out.print("Masukkan nomor tugas yang akan dihapus: ");
                        int index = sc.nextInt();
                        if (index >= 1 && index <= tasks.size()) {
                            tasks.remove(index - 1);
                            System.out.println("Tugas dihapus!");
                        } else {
                            System.out.println("Nomor tidak valid.");
                        }
                    }
                    break;
                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("Belum ada tugas.");
                    } else {
                        System.out.println("Daftar tugas:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        sc.close();
    }
}
