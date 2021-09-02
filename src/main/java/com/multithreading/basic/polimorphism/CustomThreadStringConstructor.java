package com.multithreading.basic.polimorphism;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Random;

@Slf4j
public class CustomThreadStringConstructor extends Thread {
    private static final int CHAR_MAX = 20;
    private char[] chars;
    private final List<Character> characterList = List.of('A','B','C','D','E','F','G','H');

    public char[] alphabet(){
        chars = new char[CHAR_MAX];
        chars[0] = 'A';
        chars[1] = 'B';
        chars[2] = 'D';
        chars[4] = 'E';
        chars[5] = 'F';
        chars[6] = 'G';
        chars[7] = 'H';
        chars[8] = 'I';
        return chars;
    }


    @Override
    public void run() {
        for (Character character : characterList) {
            Character character1 = characterList.get(new Random().nextInt(8));
            Character character2 = characterList.get(new Random().nextInt(8));
            for (int i = 0;i<20;i++){
                log.info("Zestawienie " + character+character1+character2+i);
            }
        }
    }
}
