package oop;

public class BujurSangkar extends Bentuk {
    private double s;
    public BujurSangkar(double s){this.s=s;}
    @Override
    public void hitungLuas(){luas=s*s;}
}