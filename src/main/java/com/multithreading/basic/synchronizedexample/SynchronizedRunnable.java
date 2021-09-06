package com.multithreading.basic.synchronizedexample;

public class SynchronizedRunnable implements Runnable{

private final SynchronizedStaticCounter counter;

    public SynchronizedRunnable(SynchronizedStaticCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i =0;i<10000;i++){
            SynchronizedStaticCounter.staticIncrement();
        }
    }
}
