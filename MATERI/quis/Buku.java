
package tugas;


public class Buku {
    String judul;
    String penerbit;
    int tahun_terbit;

    public Buku(String judul, String penerbit, int tahun_terbit) {
        this.judul = judul;
        this.tahun_terbit = tahun_terbit;
    }
    
    public Buku(){
        this.judul = "TIdak diketahui";
        this.tahun_terbit = 0;
    }
    
    public Buku(String judul){
        this.judul = judul;
        this.tahun_terbit = 0;
    }
    
    public Buku(int tahun_terbit){
        this.judul = "Tidak diketahui";
        this.tahun_terbit = tahun_terbit;
    }
    
    void tampilData(String judul){
        System.out.println("Judul : "+judul);
        System.out.println("Tahun Terbit : "+tahun_terbit);
    }
    void tampilData(){
        System.out.println("Judul : "+judul);
        System.out.println("Tahun Terbit : "+tahun_terbit);
    }
    void tampilData(String judul, int tahun_terbit){
        System.out.println("Judul : "+judul);
        System.out.println("Tahun Terbit : "+tahun_terbit);
    }
    void tampilData(int tahun_terbit){
        System.out.println("Judul : "+judul);
        System.out.println("Tahun Terbit : "+tahun_terbit);
    }    
}
