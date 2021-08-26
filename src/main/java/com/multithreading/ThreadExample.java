package com.multithreading;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadExample {


    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            for (int i =0; i<20;i++){
                log.info(" second thread loop: " + i);
            }
        });
        thread.start();

        for (int i =0; i<20;i++){
            log.info(" first thread loop: " + i);
        }
    }
}
