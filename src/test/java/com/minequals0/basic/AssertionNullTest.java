package com.minequals0.basic;

import com.minequals0.CryptoCurrency;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

// Null 여부 테스트
public class AssertionNullTest {
    @DisplayName("AssertionNull() Test")
    @Test
    public void assertNotNullTest(){
        String currencyName = getCryptoCurrency("ETH");

        // 테스트 대상 객체가 null이 아닌지 테스트 가능
        // 파라미터 : 객체, 테스트 실패 시 메시지
        assertNotNull(currencyName, "should be not null");
    }

    private String getCryptoCurrency(String unit) {
        return CryptoCurrency.map.get(unit);
    }

}
