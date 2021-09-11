package com.multithreading.threadid;

public class ThreadID {
    /**
     * @return name thread
     */
    public static int get (){
        return Integer.parseInt(Thread.currentThread().getName());
    }

}
