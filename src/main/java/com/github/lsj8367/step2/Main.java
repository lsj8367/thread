package com.github.lsj8367.step2;

public class Main {

    public static void main(String[] args) {
        Thread thread = new Thread(new BlockingTask());
        thread.start();

        // 예외를 발생시켜 해당 스레드를 바로 종료시킴
        thread.interrupt();
    }

    private static class BlockingTask implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(500000);
            } catch (InterruptedException e) {
                System.out.println("Exit Blocking Thread");
            }
        }

    }

}
