package com.minequals0.homework;

import com.minequals0.helper.StampCalculator;
import com.minequals0.order.entity.Order;
import com.minequals0.order.entity.OrderCoffee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StampCalculatorTest {

    @DisplayName("calculate Stamp Count Test")
    @Test
    public void assertionTest() {
        // given
        int nowCount = 5;
        int earned = 3;

        // when
        int expected = nowCount + earned;
        int actual = StampCalculator.calculateStampCount(nowCount, earned);

        // then
        assertEquals(expected, actual);
        // Assertions.assertEquals(expected, actual); // JUnit 5
    }



}
