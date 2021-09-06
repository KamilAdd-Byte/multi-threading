package com.multithreading.basic.synchronizedexample;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SynchronizedCounter {

    private int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    /**
     * @implNote synchronized na metodach instancji klasy -> do metody może odwołać sie NA RAZ tylko jeden wątek
     */
    public synchronized void incrementInstanceClass(){
        setCounter(getCounter()+1);
    }

    /**
     * @apiNote synchronized w blokach instancji metody -> do metody może odwołać sie NA RAZ tylko jeden wątek
     */
    public void incrementBlock (){
        synchronized (this){
            setCounter(getCounter()+1);
            log.info("Block synchronized : " + getCounter());
        }
    }
}
