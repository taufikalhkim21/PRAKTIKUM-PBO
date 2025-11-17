
package pertemuan7;


public class Kalkulator {
    int angka1;
    int angka2;

    public Kalkulator(int angka1, int angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }
    
    int tambah(){
        int hasil =angka1 +angka2;
        return hasil;
    }
    
    public void penjumlahan(){
        int hasil = angka1 +angka2;
        System.out.println("Penjumlahan : "+hasil);
    }
}
