package com.github.lsj8367.example2.hacker;

public class DescendingHackerThread extends HackerThread {

    public DescendingHackerThread(final Valut valut) {
        super(valut);
    }

    @Override
    public void run() {
        for (int i = MAX_PASSWORD; i >= 0 ; i--) {
            if (valut.isCorrectPassword(i)) {
                System.out.println(this.getName() + " 추측 " + i);
                System.exit(0);
            }
        }
    }

}
