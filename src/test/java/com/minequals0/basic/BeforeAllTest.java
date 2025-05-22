package com.minequals0.basic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class BeforeAllTest {
    private static Map<String, String> map;

    // 클래스 레벨에서 테스트케이스를 한꺼번에 실행시키면
    // 테스트 케이스 실행 전 딱 한번만 초기화 작업함
    @BeforeAll
    public static void initAll() {
        map = new HashMap<>();
        map.put("BTC", "Bitcoin");
        map.put("ETH", "Ethereum");
        map.put("ADA", "ADA");
        map.put("POT", "Polkadot");
        map.put("XRP", "Ripple");

        System.out.println("initialize Crypto Currency map");
    }

    @DisplayName("Test case 1")
    @Test
    public void beforeEachTest() {
        assertDoesNotThrow(()->getCryptoCurrency("XRP"));
    }

    @DisplayName("Test case 2")
    @Test
    public void beforeEachTest2() {
        assertDoesNotThrow(()-> getCryptoCurrency("ADA"));
    }

    private String getCryptoCurrency(String unit) {
        return map.get(unit).toUpperCase();
    }
}
