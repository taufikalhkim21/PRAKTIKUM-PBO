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
import java.util.Scanner;

public class PercetakanNovel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah novel: ");
        int jumlahNovel = sc.nextInt();

        System.out.print("Masukkan jumlah lembar per novel: ");
        int lembarPerNovel = sc.nextInt();

        int totalDetik = jumlahNovel * lembarPerNovel;

        int hari = totalDetik / 86400;
        totalDetik %= 86400;

        int jam = totalDetik / 3600;
        totalDetik %= 3600;

        int menit = totalDetik / 60;
        int detik = totalDetik % 60;

        System.out.println("\nWaktu yang dibutuhkan:");
        System.out.println(hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik");
    }
}
