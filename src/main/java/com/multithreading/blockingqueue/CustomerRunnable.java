package com.multithreading.blockingqueue;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

@Slf4j
public class CustomerRunnable implements Runnable{

    private List<String> orders = new ArrayList<>();
    private Random random = new Random();
    private BlockingQueue<String> orderQueue;

    public CustomerRunnable(BlockingQueue<String> orderQueue,String...orders) {
        this.orderQueue = orderQueue;
        for (String order: orders){
            this.orders.add(order);
        }
    }

    @Override
    public void run() {
        while (true){
            try {
                String pickedOrder = orders.get(random.nextInt(orders.size()));
                log.info("Customer asks for: " + pickedOrder);
                orderQueue.put(pickedOrder);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
