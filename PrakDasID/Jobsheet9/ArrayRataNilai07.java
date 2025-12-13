import java.util.Scanner;
public class ArrayRataNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalLulus = 0;
        double totalTdklulus = 0;
        double rataLulus = 0;
        double rataTdklulus = 0;
        int lulus = 0;
        int tdkLulus = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jmlMahasiswa];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                lulus++;
                totalLulus += nilaiMhs[i];
            }else {
                tdkLulus++;
                totalTdklulus += nilaiMhs[i];
            }
        }
        rataLulus = totalLulus / lulus;
        rataTdklulus = totalTdklulus / tdkLulus;
        System.out.println("========================================");
        System.out.println("Jumlah siswa yang lulus: " + lulus);
        System.out.println("Jumla siswa yang tidak lulus: " + tdkLulus);
        System.out.println("========================================");
        System.out.printf("Rata-rata nilai lulus: %.2f\n", rataLulus);
        System.out.printf("Rata-rata nilai tidak lulus: %.2f", rataTdklulus);
        sc.close();
    }
}