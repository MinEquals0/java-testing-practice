package com.minequals0.basic;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

// 모든 테스트가 같은 리스트 공유
// -> Test 1이 Test 2에 영향 줌
public class BeforeAllAfterAllTest {

    private static List<String> sharedList;

    // @BeforeAll, @AfterAll은 테스트 클래스의 모든 테스트 메서드가
    // 실행되기 전과 후에 딱 한 번씩 호출됨
    // 그런데 이 시점에 아직 테스트 클래스 인스턴스가 생성되지 않았거나, 여러 개일 수 있음
    // 그래서 인스턴스(객체) 없이도 호출 가능하도록 static 메서드여야 함
    @BeforeAll
    public static void initAll() {
        sharedList = new ArrayList<>();
        sharedList.add("item1");
        System.out.println("[BeforeAll] 리스트 초기화: " + sharedList);
    }

    @AfterAll
    public static void cleaupAll(){
        sharedList.clear();
        System.out.println("[AfterAll] 테스트 종료 후 리스트 상태: " + sharedList);
    }

    @DisplayName("Test 1 - 공유 리스트 추가")
    @Test
    public void test1() {
        sharedList.add("shared1");
        System.out.println("실행 중(Test 1): " + sharedList);
    }

    @DisplayName("Test 2 - 공유 리스트 추가")
    @Test
    public void test2() {
        sharedList.add("shared2");
        System.out.println("실행 중(Test 2): " + sharedList);
    }
}
