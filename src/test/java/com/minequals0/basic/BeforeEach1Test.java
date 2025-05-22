package com.minequals0.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class BeforeEach1Test {

    // 테스트 케이스가 실행 시 @BeforeEach 붙인 메서드가 먼저 실행되므로
    // 객체나 값에 대한 초기화 작업등 전처리 과정에 사용 가능
    @BeforeEach
    public void init(){
        System.out.println("Pre-processing before each test case");
    }

    @DisplayName("@BeforeEach Test1")
    @Test
    public void beforeEachTest() {

    }

    @DisplayName("@BeforeEach Test2")
    @Test
    public void beforeEachTest2(){

    }
}
