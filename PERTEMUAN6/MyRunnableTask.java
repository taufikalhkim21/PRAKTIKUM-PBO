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
public class MyRunnableTask implements Runnable {
    private int nilai;

    public MyRunnableTask(int nilai) {
        this.nilai = nilai;
    }

    @Override
    public void run() {
        for (int i = 1; i <= nilai; i++) {
            System.out.println("Thread run: " + i);
        }
    }
}