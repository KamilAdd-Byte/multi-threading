package com.multithreading.queuethread.concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;

public class GettingItemsRunnable implements Runnable{

    private ConcurrentHashMap<Integer,String>map;

    public GettingItemsRunnable(ConcurrentHashMap<Integer, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.println(map.get(1));
            System.out.println(map.get(2));
            Thread.sleep(1000);
            System.out.println(map.get(3));
            System.out.println(map.get(4));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
