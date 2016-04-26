package mainhitungan;

import java.util.Scanner;

public class MainHitungan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hitungan h = new Hitungan();
        int a, b, pil;
        double x, y;
        for (;;) {
            System.out.println(" >> Menu Perhitungan << ");
            System.out.println("    1. Penjumlahan");
            System.out.println("    2. Penguranan");
            System.out.println("    3. Perkalian");
            System.out.println("    4. Pembagian");
            System.out.println("    5. Keluar");
            System.out.print("Masukkan Pilihan anda : ");
            pil = in.nextInt();
            switch (pil) {
                case 1:
                    System.out.println("");
                    System.out.print("Masukkan nilai 1 : ");
                    a = in.nextInt();
                    System.out.print("Masukkan nilai 2 : ");
                    b = in.nextInt();
                    Hitungan.penjumlahan(a, b);
                    break;
                case 2:
                    System.out.println("");
                    System.out.print("Masukkan nilai 1 : ");
                    a = in.nextInt();
                    System.out.print("Masukkan nilai 2 : ");
                    b = in.nextInt();
                    Hitungan.pengurangan(a, b);
                    break;
                case 3:
                    System.out.println("");
                    System.out.print("Masukkan nilai 1 : ");
                    a = in.nextInt();
                    System.out.print("Masukkan nilai 2 : ");
                    b = in.nextInt();
                    h.perkalian(a, b);
                    break;
                case 4:
                    System.out.println("");
                    System.out.print("Masukkan nilai 1 : ");
                    a = in.nextInt();
                    System.out.print("Masukkan nilai 2 : ");
                    b = in.nextInt();
                    h.pembagian(a, b);
                    break;
                case 5:
                    System.out.println("Terima Kasih telah menggunakan program kami...");
                    System.exit(0);
                    break;
                default:
            }
        }
    }

}
