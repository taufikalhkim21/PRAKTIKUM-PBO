import java.util.Scanner;

public class no2 {

    // Method 
    static int hitungKeliling(int panjang, int lebar) {
        return 2 * (panjang + lebar);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Menghitung Keliling Persegi Panjang ===");

        System.out.print("Masukkan Panjang: ");
        int panjang = input.nextInt();

        System.out.print("Masukkan Lebar: ");
        int lebar = input.nextInt();

        // Memanggil method
        int keliling = hitungKeliling(panjang, lebar);

        System.out.println("Keliling Persegi Panjang adalah: " + keliling);
    }
}
