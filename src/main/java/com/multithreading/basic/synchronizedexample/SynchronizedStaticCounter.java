package com.multithreading.basic.synchronizedexample;

import lombok.extern.slf4j.Slf4j;

/**
 * Statyczne użycie synchronized. Wszystkie pola stayczne.
 */
@Slf4j
public class SynchronizedStaticCounter {
    private static int counter;

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int value) {
        counter = value;
    }

    public synchronized static void staticIncrement(){
        setCounter(getCounter()+1);
        log.info("Static synchronized: " + counter);
    }
}
