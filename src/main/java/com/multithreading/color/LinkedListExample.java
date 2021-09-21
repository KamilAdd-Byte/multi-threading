package com.multithreading.color;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedListExample extends LinkedList<String> {

    public LinkedHashSet<String> names;

    public LinkedHashSet<String> myBase () {
        names = new LinkedHashSet<>();
        names.add("Marek");
        names.add("Bożena");
        names.add("Vład");
        names.add("Marian");
        names.add("Marcin");
        names.add("Kamil");
        names.add("Cecylia");
        return names;
    }

    public void addNameToLinkedList(String name){
        if(name!=null){
            names.add(name);
        } else {
            System.err.println("Error, object it's null");
        }
    }
    public void removeNameToLinkedList(String name){
        if(name==null){
            System.err.println("Error, object it's null");
        } else {
            Iterator<String> iterator = names.iterator();
                while (iterator.hasNext()){
                    String next = iterator.next();
                    if (next.equals(name)){
                        iterator.remove();
                    }
                }
        }
    }

    public LinkedHashSet<String> getNames() {
        return names;
    }

    public void setNames(LinkedHashSet<String> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "LinkedListExample{" +
                "names=" + names +
                "} " + super.toString();
    }
}
