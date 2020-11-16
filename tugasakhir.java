import java.util.Scanner;

public class tugasakhir {

    static Scanner inp = new Scanner(System.in);
    static int jumInput, pesanMenu, porsi[], harga[], th2[], th = 0, uang, kembali;
    static String nama_makanan[];
    public static void main(String[] args) {
    	cls();
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
        System.out.format("+-----+----------------+-------------+    +-----+----------------+-------------+ %n%n");
    }

    public static void menu() {
        harga = new int[99];
        th2 = new int[99];
        porsi = new int[99];
        nama_makanan = new String [99];
        System.out.print("Berapa menu yang ingin diinput? ");
        jumInput = inp.nextInt();
        cls();
        for (int i = 1; i <= jumInput; i++) {
        	d_harga();
        	System.out.println("Menu ke-" + i);
            System.out.print("\nPilih menu yang dipesan: ");
            pesanMenu = inp.nextInt();
            switch (pesanMenu) {
                case 1:
                    harga[i] = 13000;
                    nama_makanan [i] = "Nasi Goreng   |  Rp. ";
                    break;
                case 2:
                    harga[i] = 15000;
                    nama_makanan [i] = "Mie Ayam      |  Rp. ";
                    break;
                case 3:
                    harga[i] = 18000;
                    nama_makanan [i] = "Nasi Bakar    |  Rp. ";
                    break;
                case 4:
                    harga[i] = 25000;
                    nama_makanan [i] = "Sop Kambing   |  Rp. ";
                    break;
                case 5:
                    harga[i] = 7000;
                    nama_makanan [i] = "Jus Jambu     |  Rp. ";
                    break;
                case 6:
                    harga[i] = 5000;
                    nama_makanan [i] = "Jus Jeruk     |  Rp. ";
                    break;
                case 7:
                    harga[i] = 3000;
                    nama_makanan [i] = "Air Mineral   |  Rp. ";
                    break;
                case 8:
                    harga[i] = 2000;
                    nama_makanan [i] = "Teh Manis     |  Rp. ";
                    break;
                default:
                    System.out.println("Input angka 1-8 saja!");
                    break;
            }
            System.out.print("Berapa porsi? ");
            porsi[i] = inp.nextInt();
            th2[i] = harga[i] * porsi[i];
            th = th + harga[i] * porsi[i];
        }
        cls();
        System.out.println("Total: " + th);
        System.out.print("Masukkan uang pembeli: ");
        uang = inp.nextInt();
        kembali = uang - th;
        struk();
    }
    
     public static void struk() {
    	 	cls();
            System.out.println("+-------------------------------------+");
            System.out.println("+           STRUK PEMBAYARAN          +");
            System.out.println("+-----+----------------+--------------+");
            
        for (int i = 1; i <= jumInput; i++){
        	if(porsi[i]>9) {
        	System.out.println("| "+ porsi[i] + "  |  " + nama_makanan[i] + th2[i] +"  |");
           } else if(th2[i]<10000) {
        	  System.out.println("|  "+ porsi[i] + "  |  " + nama_makanan[i] + th2[i] +"    |");
           } else if(th2[i]>99000) {
        	   System.out.println("|  "+ porsi[i] + "  |  " + nama_makanan[i] + th2[i] +"  |");
          } else System.out.println("|  "+ porsi[i] + "  |  " + nama_makanan[i] + th2[i] +"   |");
        }
        
        System.out.println("+-----+----------------+--------------+");
            if(th>99000) {
            	 System.out.println("|  Total               |  Rp. " + th + "  |");
            } else if(th<10000) {
           	 System.out.println("|  Total               |  Rp. " + th + "    |");
            	} else System.out.println("|  Total               |  Rp. " + th + "   |");
            
            if(uang>99000) {
            	System.out.println("|  Uang                |  Rp. " + uang + "  |");
            } else if(uang<10000) {
            	System.out.println("|  Uang                |  Rp. " + uang + "    |");
               } else System.out.println("|  Uang                |  Rp. " + uang + "   |");
            
            if(kembali>99000) {
            	System.out.println("|  Kembalian           |  Rp. " + kembali + "  |");
            } else if(kembali<10000 && kembali>0) {
            	System.out.println("|  Kembalian           |  Rp. " + kembali + "    |");
               } else if(kembali == 0) {
            	System.out.println("|  Kembalian           |  Rp. " + kembali + "       |");
               } else System.out.println("|  Kembalian           |  Rp. " + kembali + "   |");
            System.out.println("+----------------------+--------------+");
    }
     
     public static void cls(){
 		for(int i=0; i<35; i++) {
 			System.out.println();
 		}
     }
}
