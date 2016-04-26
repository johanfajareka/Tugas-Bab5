package mainkomdas;

import java.util.Scanner;

public class MainKomdas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pil,jml;
        
        for (;;) {
            System.out.println("");
            System.out.println(" >> CV.Labkomdas << ");
            System.out.println("======= MENU =======");
            System.out.println("1. Pembelian Jaket A");
            System.out.println("2. Pembelian Jaket B");
            System.out.println("3. Pembelian Jaket C");
            System.out.println("4. Keluar Program ");
            System.out.print("Masukkan Pilihan : ");
            pil = in.nextInt();
            switch (pil) {
                case 1:
                    System.out.println("");
                    System.out.println("Masukkan jumlah jaker : ");
                    jml = in.nextInt();
                    Komdas.hitungJaketA(jml);
                    break;
            }
        }
        
        
    }
    
}
