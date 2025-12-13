package nyoba;

class orang {
    protected String nama;
    protected int usia;

    public orang (String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }
    public String dapatKanNama() {
        return nama;
    }
    public int dapaKanUsia() {
        return usia;
    }
}
public class turu {
    public static void main(String[] args) {
        
    orang siswa = new orang ("Budi", 16);
    System.out.println("Nama: " + siswa.dapatKanNama());
    System.out.println("Usia: " + siswa.dapaKanUsia());
    }
}