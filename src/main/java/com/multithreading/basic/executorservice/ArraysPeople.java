package com.multithreading.basic.executorservice;

public class ArraysPeople {
    private final static int MAX_ARRAYS_PEOPLE = 6;
    private String[] names;
    private String[] surName;

    public String[] names (){
        names = new String[MAX_ARRAYS_PEOPLE];
        names[0] = "Jan";
        names[1] = "Janina";
        names[2] = "Bart";
        names[3] = "Amek";
        names[4] = "Queen";
        names[5] = "Walery";
        return names;
    }

    public String[] surName (){
        surName = new String[MAX_ARRAYS_PEOPLE];
        surName[0] = "Jankowski";
        surName[1] = "Jarczewski";
        surName[2] = "Bartoski";
        surName[3] = "Wołodyjowski";
        surName[4] = "Pasztet";
        surName[5] = "Porki";
        return surName;
    }
}
