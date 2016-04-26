package mainhitungan;

public class Hitungan {

    private static double a;
    private static int b;
    
    public Hitungan() {
        
    }    

    public static void penjumlahan(int x, int y) {
        b = x + y;
        System.out.println("Hasil penjumlahan = " + b);
    }

    public static void pengurangan(int x, int y) {
        b = x - y;
        System.out.println("Hasil penjumlahan = " + b);
    }

    public void perkalian(int x, int y) {
        b = x * y;
        System.out.println("Hasil perkalian = " + b);
    }

    public void pembagian(double x, double y) {
        a = x / y;
        Hitungan hitung = new Hitungan();
        hitung.sederhana(a);
    }

    public void sederhana(double c) {
        System.out.printf("Hasil pembagian = %.2f", a);
    }
}
