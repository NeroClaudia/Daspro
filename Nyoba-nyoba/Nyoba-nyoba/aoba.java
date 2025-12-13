import java.util.Scanner;

public class aoba {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    String nama;
    System.out.println("Siapa namamu?");

    nama = sc.nextLine();
    System.out.print("Halo " + nama);
       try {
            Thread.sleep (1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.print("!");

        try {
            Thread.sleep (300);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.print("!");

        try {
            Thread.sleep (300);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.print("!");

        try {
            Thread.sleep (300);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println();
    
    while (true) {

        try {
            Thread.sleep(800);

        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Mau makan/minum apa hari ini?");
        String makan = sc.nextLine();
        
            
    boolean cocok = false;

    if (makan.equalsIgnoreCase("Tidak jadi")) {
        System.out.println("Kocak lu");
        break;
    }

    else if (makan.equalsIgnoreCase("Penis kuda")){

           try {
            Thread.sleep (1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Keren kamu bang");
        cocok = true;
    

    }else if (makan.equalsIgnoreCase("Susu ganyu")){

           try {
            Thread.sleep (1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("I see, you're a man of culture");
        cocok = true;

    }else if (makan.equalsIgnoreCase("Susu makima")){

           try {
            Thread.sleep (1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Wah, sedap nih!");
        cocok = true;

    }else if (makan.equalsIgnoreCase("Sate")){

           try {
            Thread.sleep (1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Kanker kau lama-lama cok!");
        cocok = true;

    }else if (makan.equalsIgnoreCase("Gurame")){

        try {
            Thread.sleep (1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Sama aja kau, mau mati?");
        cocok = true;

    }else {
        System.out.println("Tidak ada dalam menu");
        cocok = false;
    }
    if (cocok) {
        break;
    }
        }
         sc.close();
    }
}