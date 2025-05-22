package com.minequals0.basic;

import com.minequals0.CryptoCurrency;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

// 예외(Exeption) 테스트
public class AssertionExceptionTest {
    @DisplayName("throws NullPointerException when map.get()")
    @Test
    public void assertionThrowExceptionTest() {
        // 파라미터 : 발생이 기대되는 예외 클래스, 테스트 대상 메서드
        assertThrows(NullPointerException.class, () -> getCryptoCurrency("XRP"));

        // 예외 클래스 상속 관계
        // assertThrows() 사용해 테스트 하기 위해선 예외 클래스의 상속 관계를 알아야 함

        // failed, ISE와 NPE은 다른 타입, ISE이 상위 타입도 아니므로
       // assertThrows(IllegalStateException.class, () -> getCryptoCurrency("XRP"));

        // passed, NPE은 RuntimeE를 상속하는 하위타입,R~E는 Exception 상속하는 하위 타입
         assertThrows(RuntimeException.class, () -> getCryptoCurrency("XRP"));
         assertThrows(Exception.class, () -> getCryptoCurrency("XRP"));

    }

    private String getCryptoCurrency(String unit) {
        // XRP 암호화폐는 map에 존재 X, map의 반환값 null
        // 반환값이 null(아무것도 없음)인 상태서 toUpperCase() 호출하니 NPE 발생
        return CryptoCurrency.map.get(unit).toUpperCase();
    }


}

