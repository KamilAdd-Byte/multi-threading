package com.multithreading.queuethread.priorityblockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;

public class TestBlockingPriority {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        BlockingQueue<Case> caseQueue = new PriorityBlockingQueue<>();

        Case case1 = new Case("broken finger", 3);
        Case case2 = new Case("broken leg", 4);
        Case case3 = new Case("flu", 2);
        Case case4 = new Case("common cold", 1);


        executorService.execute(new CaseRunnable(caseQueue,case1,case2,case3,case4));


        Case case5 = new Case("broken arm", 4);
        Case case6 = new Case("accident", 6);
        Case case7 = new Case("flu corn", 1);
        Case case8 = new Case("common cold", 1);

        executorService.execute(new CaseRunnable(caseQueue,case5,case6,case7,case8));
        executorService.execute(new HospitalRunnable(caseQueue));

    }
}
