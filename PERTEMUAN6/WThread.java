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
public class WThread extends Thread {
    private String pesan;

    public WThread(String pesan) {
        this.pesan = pesan;
    }

    @Override
    public void run() {
        System.out.println("Pesan thread: " + pesan);
    }
}
