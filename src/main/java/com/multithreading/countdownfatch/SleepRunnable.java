package com.multithreading.countdownfatch;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;

@Slf4j
public class SleepRunnable implements Runnable{

    private CountDownLatch countDownLatch;

    public SleepRunnable(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }


    @Override
    public void run() {
        sleep();
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
