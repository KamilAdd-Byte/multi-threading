package com.multithreading.deadlock;

public class TestDeadLock {
    public static void main(String[] args) {

        Builder builder = new Builder();

        Thread thread = new Thread(() -> {
            builder.buildShip();
        });
        Thread thread1 = new Thread(() -> {
            builder.buildFighter();
        });
        thread.start();
        thread1.start();
    }
}
