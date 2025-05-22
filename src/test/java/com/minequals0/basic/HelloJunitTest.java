package com.minequals0.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloJunitTest {

    @DisplayName("Hello Junit Test")
    @Test
    public void assertionTest1() {
        String expected = "Hello, JUnit";
        // String expected = "Hello, World";
        String actual = "Hello, JUnit";

        // 기대값과 실제 결과값이 같은지 검증
        assertEquals(expected, actual);

        // 위와 같은 코드
        // Assertions.assertEquals(expected, actual);
    }
}
