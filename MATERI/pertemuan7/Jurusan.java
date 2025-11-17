
package pertemuan7;

import java.util.ArrayList;


public class Jurusan {
    private String namaJurusan;
    private ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();

    public Jurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }
    
    public void tambahMahasiswa(Mahasiswa mhs){
        mahasiswaList.add(mhs);
    }
    
    public void tampilData(){
        System.out.println("Jurusan : " +namaJurusan);
        System.out.println("Daftar Mahasiswa : ");
        
        for(Mahasiswa m : mahasiswaList){
            System.out.println("- "+ m.getNama());
        }
    }
}
