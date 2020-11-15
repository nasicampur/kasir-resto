import java.util.Scanner;

public class tugasakhir {

    static Scanner inp = new Scanner(System.in);
    static int jumInput, pesanMenu, harga[];
    static String nama_makanan[];
    public static void main(String[] args) {
        d_harga();
        menu();
    }

    public static void d_harga(){
        System.out.println("\n\n                                 APLIKASI KASIR \n");
        System.out.format("+------------------------------------+    +------------------------------------+ %n");
        System.out.format("+        DAFTAR MENU MAKANAN         +    +        DAFTAR MENU MINUMAN         + %n");
        System.out.format("+-----+----------------+-------------+    +-----+----------------+-------------+ %n");
        System.out.format("| No. |      Menu      |    Harga    |    | No. |      Menu      |    Harga    | %n");
        System.out.format("+-----+----------------+-------------+    +-----+----------------+-------------+ %n");
        System.out.format("|  1  |  Nasi Goreng   |  Rp. 13000  |    |  5  |  Jus Jambu     |  Rp. 7000   | %n");
        System.out.format("|  2  |  Mie Ayam      |  Rp. 15000  |    |  6  |  Jus Jeruk     |  Rp. 5000   | %n");
        System.out.format("|  3  |  Nasi Bakar    |  Rp. 18000  |    |  7  |  Air Mineral   |  Rp. 3000   | %n");
        System.out.format("|  4  |  Sop Kambing   |  Rp. 25000  |    |  8  |  Teh Manis     |  Rp. 2000   | %n");
        System.out.format("+-----+----------------+-------------+    +-----+----------------+-------------+%n");
    }

    public static void menu() {
        harga = new int[99];
        nama_makanan = new String [99];
        System.out.print("Berapa menu yang ingin diinput? ");
        jumInput = inp.nextInt();
        for (int i = 1; i <= jumInput; i++) {
            System.out.print("Pilih menu yang dipesan: ");
            pesanMenu = inp.nextInt();
            switch (pesanMenu) {
                case 1:
                    harga[i] = 13000;
                    nama_makanan [i] = "Nasi Goreng   |  Rp. 13000";
                    break;
                case 2:
                    harga[i] = 15000;
                    nama_makanan [i] = "Mie Ayam      |  Rp. 15000";
                    break;
                case 3:
                    harga[i] = 18000;
                    nama_makanan [i] = "Nasi Bakar    |  Rp. 18000";
                    break;
                case 4:
                    harga[i] = 25000;
                    nama_makanan [i] = "Sop Kambing   |  Rp. 25000";
                    break;
                case 5:
                    harga[i] = 7000;
                    nama_makanan [i] = "Jus Jambu     |  Rp.  7000";
                    break;
                case 6:
                    harga[i] = 5000;
                    nama_makanan [i] = "Jus Jeruk     |  Rp.  5000";
                    break;
                case 7:
                    harga[i] = 3000;
                    nama_makanan [i] = "Air Mineral   |  Rp.  3000";
                    break;
                case 8:
                    harga[i] = 2000;
                    nama_makanan [i] = "Teh Manis     |  Rp.  2000";
                    break;
                default:
                    System.out.println("Input angka 1-8 saja!");
                    break;
            }
        }
        struk();
    }
    
     public static void struk() {
            System.out.println("+------------------------------------+");
            System.out.println("+          STRUK PEMBAYARAN          +");
            System.out.println("+-----+----------------+-------------+");
        for (int i = 1; i <= jumInput; i++){
            System.out.println("|  "+i+"  |  "+nama_makanan[i]+"  |");
        }
            System.out.println("+-----+----------------+-------------+");
    }
}
