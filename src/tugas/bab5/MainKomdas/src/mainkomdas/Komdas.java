package mainkomdas;

public class Komdas {

    private final int a = 100000;
    private final int b = 125000;
    private final int c = 175000;

    public static void hitungJaketA(int jml) {
        if (jml > 100) {
            int harga = jml * 95000;
            System.out.println("Total harga jaket A = Rp " + harga);
        } else {
            int harga = jml * 100000;
            System.out.println("Total harga jaket A = Rp " + harga);
        }
    }
}
