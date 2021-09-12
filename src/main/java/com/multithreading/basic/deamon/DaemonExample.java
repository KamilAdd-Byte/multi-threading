package com.multithreading.basic.deamon;

public class DaemonExample {
    // Daemon pełni funkcję pomocniczą.
    public static void main(String[] args) {
        LoopExample loopExample = new LoopExample();
        Thread thread = new Thread(loopExample::run);
        thread.start();

//        Thread thread1 = new Thread(loopExample::run);
//        thread1.start();


        try {
            thread.join();

        } catch (InterruptedException e) {
            e.getMessage();
            e.printStackTrace();
        }




    }


}
