package com.multithreading.basic.synchronizedexample;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestSynchronized {
    public static void main(String[] args) {

       SynchronizedStaticCounter counter = new SynchronizedStaticCounter();

        Thread thread1 = new Thread(new SynchronizedRunnable(counter));
        Thread thread2 = new Thread(new SynchronizedRunnable(counter));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        log.info("Result: " + counter.getCounter());
    }
}
