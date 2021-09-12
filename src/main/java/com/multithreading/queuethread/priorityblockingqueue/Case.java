package com.multithreading.queuethread.priorityblockingqueue;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Case implements Comparable{

    private String type;
    private Integer priority;

    public Case(String type, Integer priority) {
        this.type = type;
        this.priority = priority;
    }

    @Override
    public int compareTo(Object o) {
        return -this.getPriority().compareTo(((Case)o).getPriority());
    }
}
