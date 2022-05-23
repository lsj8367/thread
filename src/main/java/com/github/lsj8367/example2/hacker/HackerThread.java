package com.github.lsj8367.example2.hacker;

public abstract class HackerThread extends Thread {

    protected static final int MAX_PASSWORD = 9999;

    protected Valut valut;

    public HackerThread(final Valut valut) {
        this.valut = valut;
        //스레드의 이름 변경
        this.setName(this.getClass().getSimpleName());
        this.setPriority(Thread.MAX_PRIORITY); //우선순위 최대
    }

    @Override
    public synchronized void start() {
        System.out.println("Thread start!!!!" + this.getName());
        super.start();
    }

}
