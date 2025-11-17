package pertemuan6;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.print("Masukan Baris :");
        int ab = input.nextInt();
        System.out.print("Masukan Kolom :");
        int ba = input.nextInt();
        
        System.out.println("elements = " + matriks[ab][ba]);

        for (int[] a : matriks) {
            for (int b : a) {
                System.out.print(" " + b);
            }
            System.out.println("");
        }
    }
}
