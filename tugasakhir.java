import java.util.Scanner;

public class tugasakhir {

    static Scanner inp = new Scanner(System.in);
    static int jumInput, pesanMenu, harga[];
    public static void main(String[] args) {
        d_harga();
        menu();
    }

    public static void d_harga(){
        System.out.println("\n\n                                 APLIKASI KASIR \n");
        System.out.format("+------------------------------------+    +------------------------------------+ %n");
        System.out.format("+        DAFTAR MENU MAKANAN         +    +        DAFTAR MENU MINUMAN         + %n");
        System.out.format("+----------------------+-------------+    +----------------------+-------------+ %n");
        System.out.format("| No. |      Menu      |    Harga    |    | No. |      Menu      |    Harga    | %n");
        System.out.format("+-----+----------------+-------------+    +----------------------+-------------+ %n");
        System.out.format("|  1  |  Nasi Goreng   |  Rp. 13000  |    |  5  |  Jus Jambu     |  Rp. 7000   | %n");
        System.out.format("|  2  |  Mie Ayam      |  Rp. 15000  |    |  6  |  Jus Jeruk     |  Rp. 5000   | %n");
        System.out.format("|  3  |  Nasi Bakar    |  Rp. 18000  |    |  7  |  Air Mineral   |  Rp. 3000   | %n");
        System.out.format("|  4  |  Sop Kambing   |  Rp. 25000  |    |  8  |  Teh Manis     |  Rp. 2000   | %n");
        System.out.format("+----------------------+-------------+    +----------------------+-------------+%n");
    }

    public static void menu() {
        harga = new int[99];
        System.out.print("Berapa menu yang ingin diinput? ");
        jumInput = inp.nextInt();
        for (int i = 1; i <= jumInput; i++) {
            System.out.print("Pilih menu yang dipesan: ");
            pesanMenu = inp.nextInt();
            switch (pesanMenu) {
                case 1:
                    harga[i] = 13000;
                    break;
                case 2:
                    harga[i] = 15000;
                    break;
                case 3:
                    harga[i] = 18000;
                    break;
                case 4:
                    harga[i] = 25000;
                    break;
                
                default:
                    break;
            }
        }
    }
}

