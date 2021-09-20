package com.multithreading.deadlock;

public class SteelResource {

    public void getSteel(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Getting steel for threed " + Thread.currentThread().getName());
    }
}
