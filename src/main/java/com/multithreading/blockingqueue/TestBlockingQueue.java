package com.multithreading.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestBlockingQueue {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        BlockingQueue<String> orderQueue = new ArrayBlockingQueue<>(10);


        executorService.execute(new CustomerRunnable(orderQueue,"Chicken","Pasta","Beef"));
        executorService.execute(new CustomerRunnable(orderQueue,"Colla","Water","Beear"));

        executorService.execute(new RestaurantRunnable(orderQueue));

    }
}
