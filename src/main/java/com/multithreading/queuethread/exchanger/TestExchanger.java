package com.multithreading.queuethread.exchanger;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExchanger {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Exchanger<Item>itemExchanger = new Exchanger<>();

        executorService.execute(new WarriorRunnable(itemExchanger,new Item("basic sword",0)));
        executorService.execute(new BlacksmithRunnable(itemExchanger,new Item("Reinforced sword",2)));

        executorService.shutdown();
    }
}
