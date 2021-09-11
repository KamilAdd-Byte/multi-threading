package com.multithreading.countdownfatch;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;

@Slf4j
public class HuntRunnable implements Runnable{

    private CountDownLatch countDownLatch;

    public HuntRunnable(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        log.info("Enter to hunt! " + Thread.currentThread().getName());
        hunt();
        countDownLatch.countDown();//wywołania obniza licznik (3) o jeden.
        log.info("Leaving the hunt! " + Thread.currentThread().getName());
    }
    private void hunt(){
        log.info(" Character from the thread: " + Thread.currentThread().getName() + " is hunting");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info(" Character from the thread: " + Thread.currentThread().getName() + " come back from the hunt");
    }
}
