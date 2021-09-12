package com.multithreading.queuethread.priorityblockingqueue;

import java.util.concurrent.BlockingQueue;

public class HospitalRunnable implements Runnable{

    private BlockingQueue<Case> caseBlockingQueue;

    public HospitalRunnable(BlockingQueue<Case> caseBlockingQueue) {
        this.caseBlockingQueue = caseBlockingQueue;
    }

    @Override
    public void run() {

        while (true){
            try {
                Case aCase = caseBlockingQueue.take();
                System.out.println("Case: " + aCase.getType() + " is taken to the doctor");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
