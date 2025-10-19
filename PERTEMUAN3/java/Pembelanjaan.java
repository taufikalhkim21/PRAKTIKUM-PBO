/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS3;

/**
 *
 * @author User
 */
import java.io.*;

public class Pembelanjaan {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);

        System.out.print("Nama: ");
        String nama = dis.readLine();

        System.out.print("Total Belanja: ");
        double totalBelanja = Double.parseDouble(dis.readLine());

        System.out.print("Diskon (%): ");
        double diskon = Double.parseDouble(dis.readLine());

        double totalBayar = totalBelanja - (totalBelanja * diskon / 100);

        System.out.print("Bayar: ");
        double bayar = Double.parseDouble(dis.readLine());

        double kembalian = bayar - totalBayar;

        System.out.println("\n=== STRUK PEMBAYARAN ===");
        System.out.println("Nama        : " + nama);
        System.out.println("Total Belanja: " + totalBelanja);
        System.out.println("Diskon       : " + diskon + "%");
        System.out.println("Total Bayar  : " + totalBayar);
        System.out.println("Uang Bayar   : " + bayar);
        System.out.println("Kembalian    : " + kembalian);
    }
}