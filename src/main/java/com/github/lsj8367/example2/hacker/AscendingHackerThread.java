package com.github.lsj8367.example2.hacker;

public class AscendingHackerThread extends HackerThread {

    public AscendingHackerThread(final Valut valut) {
        super(valut);
    }

    @Override
    public void run() {
        for (int i = 0; i < MAX_PASSWORD; i++) {
            if (valut.isCorrectPassword(i)) {
                System.out.println(this.getName() + " 비밀번호 추측 " + i);
                System.exit(0);
            }
        }
    }

}
