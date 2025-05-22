package com.minequals0.homework;

import com.minequals0.helper.StampCalculator;
import com.minequals0.order.entity.Order;
import com.minequals0.order.entity.OrderCoffee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StampCalculatorTest {

    @DisplayName("실습1: 스탬프 카운트 계산 단위 테스트")
    @Test
    public void calculateStampCountTest() {
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

    @DisplayName("실습2: 주문 후 누적 스탬프 카운트 계산 단위 테스트")
    @Test
    public void calculateEarnedStampCountTest() {
        // given
        Order order = new Order();
        OrderCoffee orderCoffee1 = new OrderCoffee();
        orderCoffee1.setQuantity(3);

        OrderCoffee orderCoffee2 = new OrderCoffee();
        orderCoffee2.setQuantity(5);

        order.setOrderCoffees(List.of(orderCoffee1, orderCoffee2));

        // when
        int expected = orderCoffee1.getQuantity() + orderCoffee2.getQuantity();
        int actual = StampCalculator.calculateEarnedStampCount(order);

        // then
        assertEquals(expected, actual);

    }



}
