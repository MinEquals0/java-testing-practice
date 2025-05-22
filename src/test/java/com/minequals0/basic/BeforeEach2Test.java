package com.minequals0.basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class BeforeEach2Test {
    private Map<String, String> map;

    @BeforeEach
    public void init(){
        map = new HashMap<>();
        map.put("BTC", "Bitcoin");
        map.put("ETH", "Ethereum");
        map.put("ADA", "ADA");
        map.put("POT", "Polkadot");
    }

    // 실제 테스트가 끝난 후 리소스를 정리하는 데 사용
    // 콘솔에 현재 map 상태를 출력하여 확인 가능
    @AfterEach
    public void cleanUp() {
        map.clear();
        System.out.println("AfterEach: map 정리됨 -> 현재 map 크기 : " + map.size());
    }

    @DisplayName("Test case 1")
    @Test
    public void beforeEachTest(){
        map.put("XRP", "Ripple");
        // 예외가 발생하지 않는다고 기대하는 메서드
        assertDoesNotThrow(()-> getCryptoCurrency("XRP"));
    }

    @DisplayName("Test case 2")
    @Test
    public void beforeEachTest2() {
        System.out.println(map);
        assertDoesNotThrow(() -> getCryptoCurrency("XRP"));
    }

    private String getCryptoCurrency(String unit) {
        return map.get(unit).toUpperCase();
    }

}
