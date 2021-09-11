package com.multithreading.basic.callable;

import lombok.extern.slf4j.Slf4j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Slf4j
public class TestDivider {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        List<Future<Double>>futureList = new ArrayList<>();
        for (int i = 0; i < 5;i++){
            Future<Double> submit = executorService.submit(new Divider((double) i * 5));
            futureList.add(submit);
            log.info("Submit: " + submit);
        }
        for (Future<Double> doubleFuture : futureList) {
            try {
                log.info("Lista: " + doubleFuture.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        log.info("End");
    }
}
