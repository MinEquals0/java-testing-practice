package com.minequals0.basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

// 각 테스트마다 list는 새로 만들어짐
// -> 서로 영향 없음
public class BeforeEachAfterEachTest {

    private List<String> list;

    @BeforeEach
    public void setUp(){
        list = new ArrayList<>();
        list.add("item1");
        System.out.println("[BeforeEach] 리스트 초기화: " + list);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("[AfterEach] 리스트 정리 전: " + list);
        list.clear();
        System.out.println("[AfterEach] 리스트 정리 후: " + list);
    }

    @DisplayName("Test 1 - 요소 추가")
    @Test
    public void testAddElement1() {
        list.add("test1");
        System.out.println("실행 중(Test 1): " + list);
    }

    @DisplayName("Test 2 - 요소 추가")
    @Test
    public void testAddElement2(){
        list.add("test2");
        System.out.println("실행 중(Test 2): " + list);
    }
}
