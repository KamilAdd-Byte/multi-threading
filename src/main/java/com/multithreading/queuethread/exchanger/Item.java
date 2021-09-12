package com.multithreading.queuethread.exchanger;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {

    private String name;
    private int modifier;

    public Item(String name, int modifier) {
        this.name = name;
        this.modifier = modifier;
    }

    @Override
    public String toString() {
        return name + " + " + modifier;
    }
}
