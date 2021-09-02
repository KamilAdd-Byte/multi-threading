package com.multithreading.basic;

import lombok.extern.slf4j.Slf4j;
import java.util.Scanner;

@Slf4j
public class CustomRunnable implements Runnable{

    Scanner scanner = new Scanner(System.in);

    @Override
    public void run(){
        System.out.println("Imię?");
        String name = scanner.next();
        System.out.println("witaj " + name);
    }
}
