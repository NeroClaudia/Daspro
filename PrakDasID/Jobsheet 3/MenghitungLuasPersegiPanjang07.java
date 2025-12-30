import java.util.Scanner;

public class MenghitungLuasPersegiPanjang07 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    //Variabel

    int panjang;
    int lebar;
    int luas;

    //Input

    panjang = sc.nextInt();
    lebar = sc.nextInt();

    //Luas persegi panjang

    luas = panjang*lebar;

    //Output

    System.out.println("Luas persegi panjang adalah: " + luas);

    sc.close();
    
    }
    
}
