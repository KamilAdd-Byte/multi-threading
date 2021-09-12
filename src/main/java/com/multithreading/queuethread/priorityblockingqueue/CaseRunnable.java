package com.multithreading.queuethread.priorityblockingqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class CaseRunnable implements Runnable{

    private BlockingQueue<Case> casesQueue;
    private List<Case>cases = new ArrayList<>();
    private Random random = new Random();

    public CaseRunnable(BlockingQueue<Case> casesQueue, Case...cases) {
        this.casesQueue = casesQueue;
        for (Case aCase : cases) {
            this.cases.add(aCase);
        }
    }

    @Override
    public void run() {
        while (true){
            try {
                Case randomCase = cases.get(random.nextInt(cases.size()));
                System.out.println("Case " + Thread.currentThread().getName() + " arrived, type: " +
                        randomCase.getType() + " priority: " + randomCase.getPriority());
                casesQueue.put(randomCase);
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
