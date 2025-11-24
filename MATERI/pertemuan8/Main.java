
package pertemuan8;

// Objek sebagai nilai kembali
class DataMahasiswa {
    Mahasiswa getMahasiswa(){
        Mahasiswa mhs = new Mahasiswa("Lortem", 20);
        return mhs;
    }
}

public class Main {
    public static void main(String[] args) {
       DataMahasiswa dtmhs = new DataMahasiswa();
       Mahasiswa mhs1 = dtmhs.getMahasiswa();
       
       mhs1.tampilData();
    }
    
    
}
