import java.util.Scanner;

public class t_akhir {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int pilih = 0;
        Scanner inp = new Scanner(System.in);
        do{
        clrscr();
        System.out.println("-[KALKULATOR]-\n");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Exit");
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
            case 5:
                exit();
                break;
        }
        }while(pilih<5);
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
        System.out.print("Continue (y/n) ? ");
        pilih2 = inp.next();
        if(pilih2 == "y"){
            menu();
        } else if(pilih2 == "n"){
            exit();
        }
    }

    public static void pengurangan(){
        int angka1, angka2, hasil;
        String pilih2;
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
        System.out.print("Continue (y/n) ? ");
        pilih2 = inp.next();
        switch(pilih2){
            case "y":
                menu();
                break;
            case "n":
                break;
        }
    }

    public static void perkalian(){
        int angka1, angka2, hasil;
        String pilih2;
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
        System.out.print("Continue (y/n) ? ");
        pilih2 = inp.next();
        switch(pilih2){
            case "y":
                menu();
                break;
            case "n":
                break;
        }
    }

    public static void pembagian(){
        int angka1, angka2, hasil;
        String pilih2;
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
        System.out.print("Continue (y/n) ? ");
        pilih2 = inp.next();
        switch(pilih2){
            case "y":
                menu();
                break;
            case "n":
                break;
        }
    }

    public static void clrscr() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static void exit() {
        clrscr();
        System.out.println("Exiting...");
    }
}
