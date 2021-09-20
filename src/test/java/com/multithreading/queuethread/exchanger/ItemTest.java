package com.multithreading.queuethread.exchanger;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ItemTest {


    @Test
    void getName() {
        //given
        Item item = new Item("Sword",0);
        String testName = item.getName();

        //then
        assertFalse(testName.isEmpty());
        assertThat(testName).isEqualTo("Sword");

    }

    @Test
    void getModifier() {
    }
}
