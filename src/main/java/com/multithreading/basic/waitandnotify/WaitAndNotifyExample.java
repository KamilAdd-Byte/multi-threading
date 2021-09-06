package com.multithreading.basic.waitandnotify;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WaitAndNotifyExample {

    /**
     * Wait() i Notify() musza być zaimplementowane.
     * Bez notify() metoda wait nie skończy swojego działania
     * @throws InterruptedException
     */
    public void waitMethod() throws InterruptedException {
        synchronized (this){
          log.info("Entering the wait method" + Thread.currentThread());

          wait();//Czeka na działanie notify()
          log.info("Leaving the wait method");
        }
    }

    public void yetAnotherWaitMethod() throws InterruptedException {
        synchronized (this){
            log.info("Entering the yetAnotherWaitMethod method" + Thread.currentThread());

            wait();//Czeka na działanie notify()
            log.info("Leaving the wait method");
        }
    }
    public void anotherWaitMethod() throws InterruptedException {
        synchronized (this){
            log.info("Entering the anotherWaitMethod method" + Thread.currentThread());

            wait();//Czeka na działanie notify()
            log.info("Leaving the wait method");
        }
    }
    public void notifyMethod() throws InterruptedException {
        synchronized (this){
            Thread.sleep(2000);
            notifyAll();
            log.info("Notify method starting!");
        }
    }



}
