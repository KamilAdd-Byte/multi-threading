package com.multithreading.queuethread.concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;

public class AddingItemsRunnable implements Runnable{

    private ConcurrentHashMap<Integer,String>map;

    public AddingItemsRunnable(ConcurrentHashMap<Integer, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        try {
            map.put(1,"armor");
            map.put(2,"sword");
            map.put(3,"pickaxe");
            Thread.sleep(2000);
            map.put(4,"apple");
            map.put(5,"skin");
            map.put(6,"armor 2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
