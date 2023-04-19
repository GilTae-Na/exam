package com.ll.exam1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ll.exam1.MyArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {

    @Test
    @DisplayName("testSize")
    void t1() {
        MyArrayList<String> list = new MyArrayList<>();
        assertThat(list.size()).isEqualTo(0);
    }

    @Test
    @DisplayName("add/ 사과")
    void t2() {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("사과");
        list.add("포도");
        assertThat(list.size()).isEqualTo(2);
    }

    @Test
    @DisplayName("get(1)")
    void t3() {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("사과");
        list.add("포도");
        assertThat(list.get(1)).isEqualTo("포도");
    }



}
