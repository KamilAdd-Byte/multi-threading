package com.multithreading.deadlock;

public class Builder {
    private MineralResource mineralResource = new MineralResource();
    private SteelResource steelResource = new SteelResource();

    // Pobieranie w bloku synchronized w tej samej kolejności dla obu wątów
    public void buildShip(){
        synchronized (mineralResource){
            mineralResource.getMinerals();
        synchronized (steelResource){
            steelResource.getSteel();
          }
        }
        System.out.println("Ship has been buid in thread " + Thread.currentThread().getName());
    }


    public void buildFighter(){
        synchronized (mineralResource){
            mineralResource.getMinerals();
        synchronized (steelResource){
            steelResource.getSteel();
           }
        }
        System.out.println("Fighter has been create in thread " + Thread.currentThread().getName());
    }
}
