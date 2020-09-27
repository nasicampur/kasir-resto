import java.util.Scanner;

public class t_akhir {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int pilih = 0;
        Scanner inp = new Scanner(System.in);
        clrscr();
        System.out.println("-[KALKULATOR MENU]-\n");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("0. Exit");
        System.out.print("Pilih: ");
        pilih = inp.nextInt();
        switch(pilih){
            case 1:
                penjumlahan();
                break;
            case 2:
                pengurangan();
                break;
            case 3:
                perkalian();
                break;
            case 4:
                pembagian();
                break;
            case 0:
                exit();
                break;
        }
    }

    public static void penjumlahan() {
        int angka1, angka2, hasil;
        String pilih2 = "n";
        Scanner inp = new Scanner(System.in);
        clrscr();
        System.out.println("-[PENJUMLAHAN]-\n");
        System.out.print("Masukkan angka pertama: ");
        angka1 = inp.nextInt();
        System.out.print("Masukkan angka kedua: ");
        angka2 = inp.nextInt();
        hasil = angka1 + angka2;
        clrscr();
        System.out.println("-[PENJUMLAHAN]-\n");
        System.out.println("Hasilnya adalah: " + hasil);
        lanjut();
    }

    public static void pengurangan(){
        int angka1, angka2, hasil;
        Scanner inp = new Scanner(System.in);
        clrscr();
        System.out.println("-[PENGURANGAN]-\n");
        System.out.print("Masukkan angka pertama: ");
        angka1 = inp.nextInt();
        System.out.print("Masukkan angka kedua: ");
        angka2 = inp.nextInt();
        hasil = angka1 - angka2;
        clrscr();
        System.out.println("-[PENGURANGAN]-\n");
        System.out.println("Hasilnya adalah: " + hasil);
        lanjut();
    }

    public static void perkalian(){
        int angka1, angka2, hasil;
        Scanner inp = new Scanner(System.in);
        clrscr();
        System.out.println("-[PERKALIAN]-\n");
        System.out.print("Masukkan angka pertama: ");
        angka1 = inp.nextInt();
        System.out.print("Masukkan angka kedua: ");
        angka2 = inp.nextInt();
        hasil = angka1 * angka2;
        clrscr();
        System.out.println("-[PERKALIAN]-\n");
        System.out.println("Hasilnya adalah: " + hasil);
        lanjut();
    }

    public static void pembagian(){
        int angka1, angka2, hasil;
        Scanner inp = new Scanner(System.in);
        clrscr();
        System.out.println("-[PEMBAGIAN]-\n");
        System.out.print("Masukkan angka pertama: ");
        angka1 = inp.nextInt();
        System.out.print("Masukkan angka kedua: ");
        angka2 = inp.nextInt();
        hasil = angka1 / angka2;
        clrscr();
        System.out.println("-[PEMBAGIAN]-\n");
        System.out.println("Hasilnya adalah: " + hasil);
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
