package com.multithreading.countdownfatch;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HuntRunnable implements Runnable{

    @Override
    public void run() {
        hunt();
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
