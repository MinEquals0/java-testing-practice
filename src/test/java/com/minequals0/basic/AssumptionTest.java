package com.minequals0.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

// Assumption : 특정 환경에만 테스트 케이스가 실행되도록 함
public class AssumptionTest {
    @DisplayName("Assumption Test")
    @Test
    public void assumptionTest(){
        // 파라미터 값이 true면 아래 로직들 실행
        // 테스트 케이스를 실행하는 PC 운영체제가 Windows인가? T면 아래 로직 실행됨
         assumeTrue(System.getProperty("os.name").startsWith("Windows"));

        // 운영체제가 리눅스 일 때, 결과값 ignored 아래 코드 실행 안됨
        // assumeTrue(System.getProperty("os.name").startsWith("Linux"));

        System.out.println("execute?");
        assumeTrue(processOnlyWindowTask());
    }

    private boolean processOnlyWindowTask() {
        return true;
    }
}
