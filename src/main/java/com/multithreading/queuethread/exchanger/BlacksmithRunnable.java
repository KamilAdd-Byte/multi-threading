package com.multithreading.queuethread.exchanger;

import java.util.concurrent.Exchanger;

public class BlacksmithRunnable implements Runnable{

    private Exchanger<Item> exchanger;
    private Item sword;

    public BlacksmithRunnable(Exchanger<Item> exchanger, Item sword) {
        this.exchanger = exchanger;
        this.sword = sword;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Blacksmith has + " + sword);
                Item exchange = exchanger.exchange(sword);
                System.out.println("Blacksmith received given item: " + exchange);
                sword = exchange;
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
