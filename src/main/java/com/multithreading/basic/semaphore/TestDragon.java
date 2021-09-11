package com.multithreading.basic.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestDragon {
    public static void main(String[] args) {
        Dragon dragon = new Dragon(3);
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for (int i = 0;i < 4;i++){
           executorService.submit(()-> dragon.tryToEnter());
        }
    }
}
