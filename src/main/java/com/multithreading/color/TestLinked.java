package com.multithreading.color;

import java.util.LinkedHashSet;

public class TestLinked {
    public static void main(String[] args) {

        LinkedListExample linked = new LinkedListExample();
        LinkedHashSet<String> names = linked.myBase();

        linked.addNameToLinkedList("Marcelina");
        linked.removeNameToLinkedList("Vład");
        linked.addNameToLinkedList("Artur");

        for (String name : names) {
            System.out.println(name);

            }
        }
    }

