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
import java.util.*;

public class PerbandinganClass {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input nama (Scanner): ");
        String nama1 = sc.nextLine();

        System.out.print("Input nama (BufferedReader): ");
        String nama2 = br.readLine();

        System.out.println("Nama 1: " + nama1);
        System.out.println("Nama 2: " + nama2);
    }
}
