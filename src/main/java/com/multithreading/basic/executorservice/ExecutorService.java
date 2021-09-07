package com.multithreading.basic.executorservice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExecutorService implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            log.info("Run Executor Class " +i+"E -"+ Thread.currentThread());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
