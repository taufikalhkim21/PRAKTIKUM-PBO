// Superclass Civitas
class Civitas {
    String nama;
    String status;

    // Constructor
    Civitas(String nama, String status) {
        this.nama = nama;
        this.status = status;
    }

    // Method menampilkan data
    void tampilkanData() {
        System.out.println("Nama   : " + nama);
        System.out.println("Status : " + status);
    }
}

// Subclass Dosen
class Dosen extends Civitas {

    Dosen(String nama) {
        super(nama, "Dosen Fakultas Teknik");
    }
}

// Subclass Mahasiswa
class Mahasiswa extends Civitas {

    Mahasiswa(String nama) {
        super(nama, "Mahasiswa Fakultas Teknik");
    }
}

// Subclass Staff
class Staff extends Civitas {

    Staff(String nama) {
        super(nama, "Staff Fakultas Teknik");
    }
}

// Main Program
public class no6 {
    public static void main(String[] args) {

        Dosen dosen1 = new Dosen("Muhammad Taufik");
        Mahasiswa mhs1 = new Mahasiswa("Setiawan");
        Staff staff1 = new Staff("Rahmawati");

        System.out.println("=== Data Civitas Akademika Fakultas Teknik ===\n");

        dosen1.tampilkanData();
        System.out.println();

        mhs1.tampilkanData();
        System.out.println();

        staff1.tampilkanData();
    }
}
