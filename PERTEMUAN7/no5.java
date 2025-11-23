public class no4 {

    // Constructor menampilkan kalimat pertama
    public no4() {
        System.out.println("Kami putra dan putri Indonesia");
    }

    // Method untuk menampilkan tiga sumpah
    void tampilkan() {
        System.out.println("1. Mengaku bertumpah darah yang satu, tanah air Indonesia.");
        System.out.println("2. Mengaku berbangsa yang satu, bangsa Indonesia.");
        System.out.println("3. Menjunjung bahasa persatuan, bahasa Indonesia.");
    }

    public static void main(String[] args) {
        // Membuat objek -> otomatis memanggil constructor
        no4 sp = new no4();

        // Menampilkan tiga sumpah menggunakan method
        sp.tampilkan();
    }
}
