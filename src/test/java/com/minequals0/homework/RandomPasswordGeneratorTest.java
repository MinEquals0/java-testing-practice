package com.minequals0.homework;

import com.minequals0.helper.RandomPasswordGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomPasswordGeneratorTest {
    @DisplayName("실습 3: 랜덤 패스워드 생성 테스트")
    @Test
    public void generateTest() {
        // given - totalLength : 12
        int numberOfUpperCaseLetters = 2;
        int numberOfLowerCaseLetters = 3;
        int numberOfNumeric = 4;
        int numberOfSpecialChars = 3;

        // expected
        int totalLength = numberOfUpperCaseLetters
                + numberOfLowerCaseLetters + numberOfNumeric
                + numberOfSpecialChars;

        // when  리턴타입 - String, actual
        String randomPassword = RandomPasswordGenerator.generate(numberOfUpperCaseLetters,
                numberOfLowerCaseLetters, numberOfNumeric, numberOfSpecialChars);

        // then
        assertEquals(totalLength, randomPassword.length());
        // 추가 검증
        assertEquals(numberOfUpperCaseLetters, randomPassword.chars().filter(Character::isUpperCase).count());
        assertEquals(numberOfLowerCaseLetters, randomPassword.chars().filter(Character::isLowerCase).count());
        assertEquals(numberOfNumeric, randomPassword.chars().filter(Character::isDigit).count());
        assertEquals(numberOfSpecialChars,
                randomPassword
                        .chars()
                        .filter(ch -> !(Character.isUpperCase(ch) ||
                                Character.isLowerCase(ch) ||
                                Character.isDigit(ch)))
                        .count());

    }
}
