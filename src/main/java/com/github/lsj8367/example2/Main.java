package com.github.lsj8367.example2;

import com.github.lsj8367.example2.hacker.AscendingHackerThread;
import com.github.lsj8367.example2.hacker.DescendingHackerThread;
import com.github.lsj8367.example2.hacker.Valut;
import com.github.lsj8367.example2.police.PoliceThread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        ThreadLocalRandom random = ThreadLocalRandom.current();

        Valut valut = new Valut(random.nextInt(9999));

        final List<Thread> threads = new ArrayList<>();
        threads.add(new AscendingHackerThread(valut));
        threads.add(new DescendingHackerThread(valut));
        threads.add(new PoliceThread());

        for (Thread thread : threads) {
            thread.start();
        }
    }

}
