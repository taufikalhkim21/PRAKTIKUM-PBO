package oop;

public class Lingkaran extends Bentuk {
    private double r;
    public Lingkaran(double r){this.r=r;}
    @Override
    public void hitungLuas(){luas=Math.PI*r*r;}
}