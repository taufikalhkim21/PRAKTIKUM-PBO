package oop;

public abstract class Kendaraan {
    protected String nama,jenis;
    public void setNama(String n){nama=n;}
    public void setJenis(String j){jenis=j;}
    public abstract void informasi();
}