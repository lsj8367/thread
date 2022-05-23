package com.github.lsj8367.example2.hacker;

public class Valut {
    private int password;

    public Valut(final int password) {
        this.password = password;
    }

    public boolean isCorrectPassword(final int guessPassword) {
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {

        }
        return this.password == guessPassword;
    }

}
