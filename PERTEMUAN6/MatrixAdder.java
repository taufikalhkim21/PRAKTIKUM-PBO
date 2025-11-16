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



public class MatrixAdder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] hasil = new int[2][2];

        System.out.println("Masukkan elemen matriks A:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Masukkan elemen matriks B:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                B[i][j] = sc.nextInt();

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                hasil[i][j] = A[i][j] + B[i][j];

        System.out.println("Hasil penjumlahan:");
        for (int[] x : hasil) {
            for (int y : x) System.out.print(y + " ");
            System.out.println();
        }
    }
}


