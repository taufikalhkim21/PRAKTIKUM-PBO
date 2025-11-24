
package pertemuan8;


public class Mahasiswa {
    String nama;
    int umur;

    public Mahasiswa(){
        this.nama = "Tidak diketahui";
        this.umur = 0;
    }
    
    public Mahasiswa(String nama){
        this.nama = nama;
        this.umur = 0;
    }
            
    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
    void tampilData(){
        System.out.println("Nama : "+nama);
        System.out.println("Umur : "+umur);
    }
    
    void tampilData(String jurusan, char kelas){
        System.out.println("Nama : "+nama);
        System.out.println("Umur : "+umur);
        System.out.println("Jurusan : "+jurusan);
        System.out.println("Kelas : "+kelas);
    }
}
