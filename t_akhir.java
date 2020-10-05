import java.util.Scanner;

public class t_akhir {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int pilih, harga;
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
        }
    }


    public static void d_harga(){
        System.out.format("+        MAKANAN        +   +        MINUMAN        +%n");
        System.out.format("+-------------+---------+   +-------------+---------+%n");
        System.out.format("|    Menu     |  Harga  |   |    Menu     |  Harga  |%n");
        System.out.format("+-------------+---------+   +-------------+---------+%n");
        System.out.format("+ Nasi Goreng +  15000  +   + Jus Jengkol +   5000  +%n");
        System.out.format("+ Nasi Bakar  +  20000  +   + Jus Petai   +  10000  +%n");
        System.out.format("+ Nasi Rebus  +  25000  +   + Jas Jus     +  15000  +%n");
        System.out.format("+ Nasi Kukus  +  30000  +   + Jus Tru     +  20000  +%n");
        System.out.format("+-------------+---------+   +-------------+---------+%n\n");
    }

    public static void makanan() {
        int pilih_mak, jumlah_mak, harga;
        clrscr();
        Scanner inp = new Scanner(System.in);
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Nasi Bakar");
        System.out.println("3. Nasi Rebus");
        System.out.println("4. Nasi Kukus");
        System.out.print("Pilih: ");
        pilih_mak = inp.nextInt();
        System.out.print("Jumlah: ");
        jumlah_mak = inp.nextInt();
        switch(pilih_mak){
            case 1:
                harga = 15000;
                break;
            case 2:
                harga = 20000;
                break;
            case 3:
                harga = 25000;
                break;
            case 4:
                harga = 30000;
                break;
            default:
                harga = 0;
        }
        jumlah_mak = jumlah_mak * harga;
        clrscr();
        System.out.print("Total harga: " + jumlah_mak);
        lanjut();
    }

    public static void minuman() {
        int pilih_min, jumlah_min, harga;
        clrscr();
        Scanner inp = new Scanner(System.in);
        System.out.println("1. Jus Jengkol");
        System.out.println("2. Jus Petai");
        System.out.println("3. Jas Jus");
        System.out.println("4. Jus Tru");
        System.out.print("Pilih: ");
        pilih_min = inp.nextInt();
        System.out.print("Jumlah: ");
        jumlah_min = inp.nextInt();
        switch(pilih_min){
            case 1:
                harga = 5000;
                break;
            case 2:
                harga = 10000;
                break;
            case 3:
                harga = 15000;
                break;
            case 4:
                harga = 20000;
                break;
            default:
                harga = 0;
        }
        jumlah_min = jumlah_min * harga;
        clrscr();
        System.out.print("Total harga: " + jumlah_min);
        lanjut();
    }

    public static void clrscr(){  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static void lanjut(){
        String pilih2;
        Scanner inp = new Scanner(System.in);
        System.out.print("\nKembali ke menu (y/n)? ");
        pilih2 = inp.next();
        if (pilih2.equals("y")) {
            menu();
        } else if(pilih2.equals("n")){
            exit();
        }
    }

    public static void exit() {
        clrscr();
        System.out.println("Goodbye..");
    }
}
