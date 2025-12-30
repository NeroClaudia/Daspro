public class programKu {
    public static void main(String[] args) {
        int temp = jumlah(1,1);
        tampilJumlah(temp, 5);
    }
    public static void TampilHinggaKei (int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
    }
    public static int jumlah (int bill, int bil2) {
        return (bill + bil2);
    }
    public static void tampilJumlah (int bill, int bill2) {
        TampilHinggaKei(jumlah(bill, bill2));
    }
}
