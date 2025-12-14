package oop;

public class Main {
    public static void main(String[] args) {
        Bentuk b1 = new PersegiPanjang(4,5);
        Bentuk b2 = new Lingkaran(7);

        b1.hitungLuas();
        b2.hitungLuas();

        System.out.println("Luas Persegi Panjang: " + b1.getLuas());
        System.out.println("Luas Lingkaran: " + b2.getLuas());

        InfoUniversitas uni = new UniversitasCianjur();
        uni.tampilkanInfo();

        Kendaraan m = new Mobil();
        m.setNama("Avanza");
        m.setJenis("Darat");
        m.informasi();
    }
}