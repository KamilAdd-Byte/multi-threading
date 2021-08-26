package com.multithreading;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadExample {

    private static void mainThread() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Starting loop in thread: " +Thread.currentThread().getName());
        for (int i =0; i<50;i++){
            log.info(" first thread loop: " + i);
        }
    }

    private static void secondThread(){
        log.info("Starting loop in thread: " +Thread.currentThread().getName());
        for (int i =0; i<20;i++){
            log.info(" second thread loop: " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(ThreadExample::secondThread);
        thread.start();

        elapsedTimeMainThread();


        Thread thread1 = new Thread(()->
                log.info("Starting another thread " + Thread.currentThread().getName())
        );
        thread1.start();
        thread1.setPriority(Thread.MIN_PRIORITY);
}

    private static void elapsedTimeMainThread() throws InterruptedException {
        long start = System.currentTimeMillis();
        mainThread();
        long stop = System.currentTimeMillis();
        log.info("Elapsed time: " + (stop-start));
    }
}
