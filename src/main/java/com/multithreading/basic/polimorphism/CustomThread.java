package com.multithreading.basic.polimorphism;

public class CustomThread extends Thread{

    @Override
    public void run(){
        for (int i = 0;i<100;i++){
            System.out.println("ASQ" + i);
        }
    }

}
