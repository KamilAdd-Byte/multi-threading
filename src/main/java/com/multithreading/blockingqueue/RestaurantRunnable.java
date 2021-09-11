package com.multithreading.blockingqueue;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.BlockingQueue;

@Slf4j
public class RestaurantRunnable implements Runnable{

    private BlockingQueue<String> orderQueue;

    public RestaurantRunnable(BlockingQueue<String> orderQueue) {
        this.orderQueue = orderQueue;
    }

    @Override
    public void run() {

        while (true){
            try {
                String orderToGive = orderQueue.take();
                log.info("Giving order: " + orderToGive);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
