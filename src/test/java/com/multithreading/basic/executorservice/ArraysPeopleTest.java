package com.multithreading.basic.executorservice;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@Slf4j
@SpringBootTest
class ArraysPeopleTest {

    ArraysPeople arraysPeople = new ArraysPeople();

    @Test
    void names() {
        //given
        String[] names = arraysPeople.names();

        //when
        String orElseThrow = Arrays.stream(names).findFirst().orElseThrow(IllegalArgumentException::new);
        List<String> name = Arrays.stream(names)
                .filter(n -> n.equals("Queen"))
                .collect(Collectors.toList());


        Stream<String> sorted = Arrays.stream(names)
                .sorted();

        sorted.forEach(System.out::println);

        for (String s : name) {
            log.info("Create: " + "Sre"+s);
        }

        //then
        assertThat(Arrays.stream(names).toArray().length).as("Size : ").isNotEqualTo(3);
        assertThat(names).as("Size : ").hasSize(6);
        assertThat(orElseThrow).isEqualTo("Jan");
        assertThat(name.size()).isNotNull();

    }

    @Test
    void surName() {
        List<String>strings = List.of("DD","dd","rr","ew");

        assertThat(strings).hasSize(4);
    }
}
