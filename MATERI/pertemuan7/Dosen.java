
package pertemuan7;


public class Dosen {
    private String nama;

    public Dosen(String nama) {
        this.nama = nama;
    }
    
    public void bimbing(Mahasiswa mhs){
        System.out.println(nama +" Membimbing "+ mhs.getNama());
    }
}
