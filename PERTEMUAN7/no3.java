import java.util.Scanner;

public class no3 {

    // Method berparameter
    static int hitungKodeLahir(int bulan, int tanggal) {
        return (bulan * 100) + tanggal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Trik Menebak Bulan & Tanggal Lahir ===");

        System.out.print("Masukkan Bulan Lahir (1-12): ");
        int bulan = input.nextInt();

        System.out.print("Masukkan Tanggal Lahir (1-31): ");
        int tanggal = input.nextInt();

        // Memanggil method
        int hasil = hitungKodeLahir(bulan, tanggal);

        System.out.println("\nHasil akhirnya adalah: " + hasil);
        System.out.println("(Digit ini merupakan gabungan bulan dan tanggal lahir)");
    }
}
