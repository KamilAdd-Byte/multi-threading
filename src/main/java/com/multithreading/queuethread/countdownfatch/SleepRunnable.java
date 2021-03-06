package com.multithreading.queuethread.countdownfatch;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;

@Slf4j
public class SleepRunnable implements Runnable{

    private final CountDownLatch countDownLatch;

    public SleepRunnable(final CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        log.info("Enter to sleep! " + Thread.currentThread().getName());
        sleep();
        countDownLatch.countDown();//wywołania obniza licznik (3) o jeden.
        log.info("Leaving the sleep! " + Thread.currentThread().getName());
    }

    private void sleep(){
        log.info(" Character from the thread: " + Thread.currentThread().getName() + " is sleeping");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info(" Character from the thread: " + Thread.currentThread().getName() + " wakes up");
    }
}
