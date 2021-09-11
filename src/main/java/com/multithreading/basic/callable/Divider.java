package com.multithreading.basic.callable;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
@Slf4j
public class Divider implements Callable<Double> {

    private Double number;

    public Divider(Double number) {
        this.number = number;
    }

    @Override
    public Double call() throws Exception {
        log.info("Enter call method " + Thread.currentThread().getName() + " number:" + number);
        Thread.sleep(1000);
        log.info("Leaving call method " + Thread.currentThread().getName() + " number:" + number);
        return number / 2;
    }
}
