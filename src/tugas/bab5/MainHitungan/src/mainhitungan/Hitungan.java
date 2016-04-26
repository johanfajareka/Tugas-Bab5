package mainhitungan;

public class Hitungan {
    private static double a;
    private static int b;

    public Hitungan() {

    } 
    public static void penjumlahan(int x, int y){
        b = x + y;
        System.out.println("Hasil penjumlahan = " +b);
    }
    public static void pengurangan(int x, int y){
        b = x - y;
        System.out.println("Hasil penjumlahan = " +b);
    }
}
