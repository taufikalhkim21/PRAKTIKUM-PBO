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
public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int angka = 10 / 0;
            int[] arr = new int[2];
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("Kesalahan matematika");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index array salah");
        } finally {
            System.out.println("Selesai blok try-catch");
        }
    }
}

