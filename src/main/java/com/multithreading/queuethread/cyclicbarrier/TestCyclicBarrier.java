package com.multithreading.queuethread.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCyclicBarrier {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);


        CyclicBarrier cyclicBarrier = new CyclicBarrier(3,()-> System.out.println("Soldier is ready"));

        executorService.execute(new CyclicBarrierRunnable(
                "preparing weapon",
                "bringing weapon",
                5000,
                cyclicBarrier));

        executorService.execute(new CyclicBarrierRunnable(
                "preparing uniform",
                "bringing uniform",
                9000,
                cyclicBarrier));

        executorService.execute(new CyclicBarrierRunnable(
                "preparing backpack",
                "bringing backpack ",
                7000,
                cyclicBarrier));

    }
}
