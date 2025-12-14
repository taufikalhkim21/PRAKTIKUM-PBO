package oop;

public class Mobil extends Kendaraan {
    @Override
    public void informasi(){
        System.out.println("Mobil "+nama+" Jenis "+jenis);
    }
}