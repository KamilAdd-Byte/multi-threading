package com.multithreading.basic.executorservice;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Slf4j
public class ExecutorServiceExample implements Runnable {

    ArraysPeople people = new ArraysPeople();

    @Override
    public void run() {
        String[] names = people.names();
        String[] surNames = people.surName();
        for (String surName: surNames) {
            for (String name : names) {
                Set<String> people = new HashSet<>();
                people.add(name +" " + surName);
                log.info(people + " " + Thread.currentThread());
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
