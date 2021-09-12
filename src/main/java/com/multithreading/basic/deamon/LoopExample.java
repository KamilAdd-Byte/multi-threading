package com.multithreading.basic.deamon;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;
import java.util.Scanner;

@Slf4j
public class LoopExample implements Runnable {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private int iNumber;

    @Override
    public void run() {
        log.info("Enter to run method " + Thread.currentThread().getName());
        checkToNumber();
        scanner.close();
        log.info("Leave run method " + Thread.currentThread().getName());
    }

    private void checkToNumber() {
        System.out.println("Grasz? ");
        String answer = scanner.next();

        if (answer.equals("TAK") || answer.equals("SRAK")){
            int iNumber = scanner.nextInt();
            while (random.nextInt(10)==iNumber){
                System.out.println("Podaj liczbę " + Thread.currentThread().getName());
                int userNumber = scanner.nextInt();
                int i = random.nextInt(10);
                if (userNumber == i){
                    System.out.println("YEAA! " + Thread.currentThread().getName());

                } else {
                    System.out.println("PUDŁO " + Thread.currentThread().getName() + " Liczba do zgadnięcia to: " + i);
                }
            }
        } else if (answer.equals("NIE")){
            System.out.println("Wal się");
        }else {
            System.out.println("Otrząśnij się");
        }
    }
}
