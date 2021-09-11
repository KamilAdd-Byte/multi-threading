package com.multithreading.basic.semaphore;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Semaphore;

@Slf4j
public class Dragon {

    /**
     * Semaphore - ogranicznie dostępu do określonego zasobu. Implementacja i wykorzystanie na podstawie ograniczenia
     * liczby wejść w grze do 4 max!
     */
    private Semaphore semaphore;

    public Dragon(int limitOfPlayer){
        semaphore = new Semaphore(limitOfPlayer);
    }

    public void  tryToEnter(){
        try {
            semaphore.acquire();
            log.info("Player from the thread: " + Thread.currentThread().getName() + " enter dragon");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            log.info("Player from the thread: " + Thread.currentThread().getName() + " leaves dragon");
            semaphore.release();
        }
    }
}
