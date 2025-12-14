package oop;

public class PersegiPanjang extends Bentuk {
    private double p,l;
    public PersegiPanjang(double p,double l){this.p=p;this.l=l;}
    @Override
    public void hitungLuas(){luas=p*l;}
}