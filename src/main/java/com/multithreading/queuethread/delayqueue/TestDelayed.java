package com.multithreading.queuethread.delayqueue;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
public class TestDelayed {
    public static void main(String[] args) {

        BlockingQueue<DelayedMission> missions = new DelayQueue<>();

        try {
            missions.put(new DelayedMission("Woke woke",5000));
            missions.put(new DelayedMission("Hunt hunt",9000));
            missions.put(new DelayedMission("Sold sold",7000));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (!missions.isEmpty()){
            log.info("Entry to while " + Thread.currentThread().getName());
            try {
                DelayedMission delayedMission = missions.take();
                log.info(delayedMission + " " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
