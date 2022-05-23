package com.github.lsj8367.example2.police;

public class PoliceThread extends Thread {

    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(i);
        }
        System.out.println("Game over");
    }

}
