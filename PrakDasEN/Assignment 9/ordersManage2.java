    import java.util.Scanner;

    public class ordersManage2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String[] menu = {"Nasi goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        do {

        
            System.out.print("Nama makanan yang ingin dicari: ");
            String nama = sc.nextLine();
            
            int hasil = -1;

            for (int i = 0; i < menu.length; i++) {
                if (menu[i].equalsIgnoreCase(nama)) {
                    hasil = i;
                    break;
                }
            }
            if (hasil != -1) {
                System.out.println("Makanan Tersedia");
                System.out.printf("Makanan anda ditemukan di index ke-%d\n", hasil);
            }else {
                System.out.println("Makanan tidak tersedia");
                sc.close();
            }
            
        }while(true);
        
            
    }
}