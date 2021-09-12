package com.multithreading.queuethread.concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestConcurrentHashMap {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();

        executorService.execute(new AddingItemsRunnable(map));
        executorService.execute(new GettingItemsRunnable(map));

        executorService.shutdown();

    }
}
