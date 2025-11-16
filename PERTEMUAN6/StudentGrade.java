/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN6;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        int jumlah = 0;

        while (true) {
            System.out.print("Masukkan nilai (negatif untuk berhenti): ");
            double nilai = sc.nextDouble();
            if (nilai < 0) break;

            total += nilai;
            jumlah++;
        }

        System.out.println("Rata-rata nilai: " + (total / jumlah));
    }
}

