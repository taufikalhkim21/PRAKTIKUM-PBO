
package pertemuan6;

import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        
        try {
            Scanner input = new Scanner(System.in);
        
            System.out.print("Masukan Angka a : ");
            float a = input.nextFloat();
            System.out.print("Masukan Angka b : ");
            float b = input.nextFloat();
        
            float hasil =  a/b;
            System.out.println("Hasil = " + hasil);
        } catch (Exception e) {
            System.out.println("Error tidak bisa membagi dengan nol");
        } finally {
            System.out.println("Program Selesai");
        }
    }
}
