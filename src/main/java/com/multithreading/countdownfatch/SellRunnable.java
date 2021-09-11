package com.multithreading.countdownfatch;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;

@Slf4j
public class SellRunnable implements Runnable{

    private CountDownLatch countDownLatch;

    public SellRunnable(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        sell();
    }

    private void sell(){
        log.info(" Character from the thread: " + Thread.currentThread().getName() + " is selling items");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info(" Character from the thread: " + Thread.currentThread().getName() + " sold items");
    }
}
