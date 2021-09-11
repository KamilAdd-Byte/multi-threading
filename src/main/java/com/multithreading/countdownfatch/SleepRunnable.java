package com.multithreading.countdownfatch;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SleepRunnable implements Runnable{

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
