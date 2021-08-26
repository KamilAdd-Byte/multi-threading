package com.multithreading;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadExample {
    public void Loop(){
        for (int i =0; i<1000;i++){
            System.out.println(" first loop: " + i);
            }
        for (int i = 0;i<100;i++){
            System.out.println("secong loop: "+ i);
        }
    }
    public static void main(String[] args) {
ThreadExample threadExample = new ThreadExample();
threadExample.Loop();
    }
}
