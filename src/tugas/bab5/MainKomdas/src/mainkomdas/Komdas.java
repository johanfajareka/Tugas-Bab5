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

    public static void hitungJaketB(int jml) {
        if (jml > 100) {
            int harga = jml * 120000;
            System.out.println("Total harga jaket B = Rp " + harga);
        } else {
            int harga = jml * 125000;
            System.out.println("Total harga jaket B = Rp " + harga);
        }
    }

    public static void hitungJaketC(int jml) {
        if (jml > 100) {
            int harga = jml * 160000;
            System.out.println("Total harga jaket C = Rp " + harga);
        } else {
            int harga = jml * 175000;
            System.out.println("Total harga jaket C = Rp " + harga);
        }
    }

}
