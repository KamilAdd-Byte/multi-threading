package com.multithreading.countdownfatch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class TestCountDown {
    public static void main(String[] args) {

        /**
         * @implSpec CountDownLatch(3) - liczba określajaca ile operacji trzeba wykonać,
         * żeby dane watki mogły pracować dalej.
         */
        CountDownLatch countDownLatch = new CountDownLatch(3);

        /**
         * countDownLatch - referencja do obiektu, przekazywany jest ten sam obiekt tego typu!
         */
        List<Runnable> tasks = new ArrayList<>();
        tasks.add(new HuntRunnable(countDownLatch));
        tasks.add(new SellRunnable(countDownLatch));
        tasks.add(new SleepRunnable(countDownLatch));

    }
}
