package oop;

public class Segitiga extends Bentuk {
    private double a,t;
    public Segitiga(double a,double t){this.a=a;this.t=t;}
    @Override
    public void hitungLuas(){luas=0.5*a*t;}
}