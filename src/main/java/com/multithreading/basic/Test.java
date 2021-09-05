package com.multithreading.basic;

import com.multithreading.basic.polimorphism.CustomThread;
import com.multithreading.basic.polimorphism.CustomThreadStringConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {
    public static void main(String[] args) {


        /**
         * @deprecated New object in parameters Thread.
         */
        Thread thread = new Thread(new CustomRunnable());
        thread.setPriority(1);
        thread.start();

        Thread thread1 = new CustomThread();
        thread1.start();
        int thread1Priority = thread1.getPriority();

        /**
         * .join() -> czeka aż wątek 'umrze'
         */
        try {
            thread1.join();
            thread.join();

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }



        log.info("Priorytet dla thred1 -> " + thread1Priority);

        Thread thread2 = new CustomThreadStringConstructor();
        thread2.start();

    }
}
