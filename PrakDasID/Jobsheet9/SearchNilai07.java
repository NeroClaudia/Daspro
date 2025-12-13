import java.util.Scanner;
public class SearchNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int banyakNilai = sc.nextInt();

        int[] nilai = new int[banyakNilai];

        for (int i = 0; i < banyakNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        int hasil = -1; 
        for (int i = 0; i < banyakNilai; i++) {
            if (nilai[i] == key) {
                hasil = i;
                break;
            }
        }
        if (hasil != -1) {
            System.out.printf("Nilai %d ditemukan, merupakan nilai mahasiswa ke-%d\n", key, hasil + 1);
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan");
        }
        sc.close();
    }
}
