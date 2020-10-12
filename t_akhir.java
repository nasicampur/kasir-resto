import java.util.Scanner;
import java.io.IOException;

public class t_akhir {
        static int uang, kembali, pilih_min, pilih_mak, jum_min, jum_mak, ttotal, ttotal2, harga_min[], jumlah_min[], harga_mak[], jumlah_mak[];
        static int total = 0;
        
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int pilih;
        Scanner inp = new Scanner(System.in);
        clrscr();
        d_harga();
        System.out.println("- MENU KASIR -\n");
        System.out.println("Pilih menu yg ingin diinput:");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.println("0. Exit");
        System.out.print("Pilih: ");
        pilih = inp.nextInt();
        switch(pilih){
            case 1:
                makanan();
                break;
            case 2:
                minuman();
                break;
            case 0:
                bye();
                break;
            default:
                menu();
        }
    }


    public static void d_harga(){
        System.out.format("+-----------------------+     +-----------------------+%n");
        System.out.format("+         MAKANAN       +     +         MINUMAN       +%n");
        System.out.format("+-------------+---------+     +-------------+---------+%n");
        System.out.format("|    Menu     |  Harga  |     |    Menu     |  Harga  |%n");
        System.out.format("+-------------+---------+     +-------------+---------+%n");
        System.out.format("+ Nasi Goreng +  15000  +     + Jus Jengkol +   5000  +%n");
        System.out.format("+ Nasi Bakar  +  20000  +     + Jus Petai   +  10000  +%n");
        System.out.format("+ Nasi Rebus  +  25000  +     + Jas Jus     +  15000  +%n");
        System.out.format("+ Nasi Kukus  +  30000  +     + Jus Tru     +  20000  +%n");
        System.out.format("+-------------+---------+     +-------------+---------+%n\n");
    }

    public static void makanan() {
        jumlah_mak = new int[99];
        harga_mak = new int[99];
        clrscr();
        Scanner inp = new Scanner(System.in);
        System.out.print("Berapa makanan yang ingin dibeli? ");
        jum_mak = inp.nextInt();
        for(int i=0;i<jum_mak;i++){
        clrscr();
        d_harga();
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Nasi Bakar");
        System.out.println("3. Nasi Rebus");
        System.out.println("4. Nasi Kukus");
        System.out.print("Pilih: ");
        pilih_mak = inp.nextInt();
        System.out.print("Jumlahnya berapa? ");
        jumlah_mak[i] = inp.nextInt();
        switch(pilih_mak){
            case 1:
                harga_mak[i] = 15000;
                break;
            case 2:
                harga_mak[i] = 20000;
                break;
            case 3:
                harga_mak[i] = 25000;
                break;
            case 4:
                harga_mak[i] = 30000;
                break;
            default:
                harga_mak[i] = 0;
                System.out.println("Masukkan angka 1-4!");
            }
            ttotal2 = harga_mak[i] * jumlah_mak[i];
            total = ttotal + ttotal2;
        }
        clrscr();
        System.out.println("Total harga: " + total);
        lanjut();
    }

    public static void minuman() {
        jumlah_min = new int[99];
        harga_min = new int[99];
        clrscr();
        Scanner inp = new Scanner(System.in);
        System.out.print("Berapa minuman yang ingin dibeli? ");
        jum_min = inp.nextInt();
        for(int i=0;i<jum_min;i++){
        clrscr();
        d_harga();
        System.out.println("1. Jus Jengkol");
        System.out.println("2. Jus Petai");
        System.out.println("3. Jas Jus");
        System.out.println("4. Jus Tru");
        System.out.print("Pilih: ");
        pilih_min = inp.nextInt();
        System.out.print("Jumlahnya berapa? ");
        jumlah_min[i] = inp.nextInt();
        switch(pilih_min){
            case 1:
                harga_min[i] = 5000;
                break;
            case 2:
                harga_min[i] = 10000;
                break;
            case 3:
                harga_min[i] = 15000;
                break;
            case 4:
                harga_min[i] = 20000;
                break;
            default:
                harga_min[i] = 0;
                System.out.println("Masukkan angka 1-4!");
            }
            ttotal = harga_min[i] * jumlah_min[i];
            total = ttotal + ttotal2;
        }
        clrscr();
        System.out.println("Total harga: " + total);
        lanjut();
    }

    public static void clrscr(){
        
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }

    public static void lanjut(){
        String pilih2;
        Scanner inp = new Scanner(System.in);
        System.out.print("\nKembali ke menu awal (y/n)? ");
        pilih2 = inp.next();
        if (pilih2.equals("y")) {
            menu();
        } else if (pilih2.equals("n")){
            exit();
        }
    }

    public static void exit() {
        clrscr();
        Scanner inp = new Scanner(System.in); 
        System.out.println("Total harga: " + total + "\n");
        System.out.print("Masukkan uang pembeli: ");
        uang = inp.nextInt();
        kembali = uang - total;
        clrscr();
        struk();
        System.out.println("+++++ Terima kasih sudah datang di restoran kami :) +++++\n");
    }

    public static void bye() {
        clrscr();
        System.out.println("Bye..");
    }

    public static void struk(){
        String tbl = "| %-16s | %-8d |%n";
        System.out.format("+-----------------------------+%n");
        System.out.format("|      Ket         |    Rp    |%n");
        System.out.format("+------------------+----------+%n");
        System.out.format(tbl, "Cash anda ", uang);
        System.out.format(tbl, "Total harga ", total);
        System.out.format(tbl, "Kembalian anda ", kembali);
        System.out.format("+------------------+----------+%n\n");
    }
}
