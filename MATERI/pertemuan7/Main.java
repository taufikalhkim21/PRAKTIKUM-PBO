
package pertemuan7;


public class Main {
    public static void main(String[] args) {
        Komputer komp1 = new Komputer("Lenovo", "Legion");
        komp1.addKomponen(
                new Monitor ("Asus"),
                new Processor("AMD 5600"), 
                new Mouse("Logitech")
        );
        
        komp1.tampilSpesifikasi();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //--AGREGASI
//        Mahasiswa mhs1 = new Mahasiswa("Deku");
//        Mahasiswa mhs2 = new Mahasiswa("Leri");
//        
//        Jurusan inf = new Jurusan ("Informatika");
//        inf.tambahMahasiswa(mhs1);
//        inf.tambahMahasiswa(mhs2);
//        inf.tampilData();
        
        //--ASOSIASI
//        Dosen dsn1 = new Dosen("Pak Budi");
//        Mahasiswa mhs1 = new Mahasiswa("Deku");
//        
//        dsn1.bimbing(mhs1);
  
    }
}
