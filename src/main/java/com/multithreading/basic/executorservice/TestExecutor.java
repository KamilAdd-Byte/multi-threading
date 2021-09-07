package com.multithreading.basic.executorservice;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class TestExecutor {
    public static void main(String[] args) {

        //submit przypisuje task do wątku
        java.util.concurrent.ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i<5;i++){
            service.submit(new ExecutorService());
        }


        ExecutorService executorService = new ExecutorService();
        Thread thread0 = new Thread(()-> executorService.run());
        Thread thread1 = new Thread(()-> executorService.run());
        Thread thread2 = new Thread(()-> executorService.run());

        thread0.start();
        thread1.start();
        thread2.start();

    }
}
