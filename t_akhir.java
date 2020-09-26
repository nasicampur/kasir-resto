import java.util.Scanner;

public class t_akhir {
    public static void main(String[] args) {

        int pilih;
        Scanner inp = new Scanner(System.in);
        clrscr();
        System.out.println("KALKULATOR");
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
                System.out.println("Exiting...");
                break;
        }
        inp.close();
    }

    public static void penjumlahan() {
        int angka1, angka2, hasil;
        Scanner inp = new Scanner(System.in);
        clrscr();
        System.out.print("Masukkan angka pertama: ");
        angka1 = inp.nextInt();
        System.out.print("Masukkan angka kedua: ");
        angka2 = inp.nextInt();
        hasil = angka1 + angka2;
        inp.close();
        clrscr();
        System.out.println("Hasilnya adalah: " + hasil);
    }

    public static void pengurangan(){
        int angka1, angka2, hasil;
        Scanner inp = new Scanner(System.in);
        clrscr();
        System.out.print("Masukkan angka pertama: ");
        angka1 = inp.nextInt();
        System.out.print("Masukkan angka kedua: ");
        angka2 = inp.nextInt();
        hasil = angka1 - angka2;
        inp.close();
        clrscr();
        System.out.println("Hasilnya adalah: " + hasil);
    }

    public static void perkalian(){
        int angka1, angka2, hasil;
        Scanner inp = new Scanner(System.in);
        clrscr();
        System.out.print("Masukkan angka pertama: ");
        angka1 = inp.nextInt();
        System.out.print("Masukkan angka kedua: ");
        angka2 = inp.nextInt();
        hasil = angka1 * angka2;
        inp.close();
        clrscr();
        System.out.println("Hasilnya adalah: " + hasil);
    }

    public static void pembagian(){
        int angka1, angka2, hasil;
        Scanner inp = new Scanner(System.in);
        clrscr();
        System.out.print("Masukkan angka pertama: ");
        angka1 = inp.nextInt();
        System.out.print("Masukkan angka kedua: ");
        angka2 = inp.nextInt();
        hasil = angka1 / angka2;
        inp.close();
        clrscr();
        System.out.println("Hasilnya adalah: " + hasil);
    }

    public static void clrscr() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

}
