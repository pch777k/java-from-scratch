package com.pch777;

import org.junit.jupiter.api.Test;

import static com.pch777.Homework5.*;
import static org.junit.jupiter.api.Assertions.*;
public class Homework5Test {

    @Test
    void shouldFindACharacterInText() {
        //given
        char character = 's';
        String text = "The only way to do great work is to love what you do";
        //when
        boolean result = isASpecificCharacterInTextForLoopWithBreak(character, text);
        //then
        assertTrue(result);
    }

    @Test
    void shouldNotFindACharacterInText() {
        //given
        char character = 'z';
        String text = "The only way to do great work is to love what you do";
        //when
        boolean result = isASpecificCharacterInTextForLoopWithBreak(character, text);
        //then
        assertFalse(result);
    }

    @Test
    void exceptionShouldBeThrownWhenTheTextIsNull() {
        //given
        char character = 'z';
        String text = null;
        //when
        //then
        assertThrows(NullPointerException.class, () -> isASpecificCharacterInTextForLoopWithBreak(character, text));
    }

    @Test
    void shouldFindACharInText() {
        //given
        char character = 's';
        String text = "The only way to do great work is to love what you do";
        //when
        boolean result = isASpecificCharacterInTextWhileLoopWithBreakStatement(character, text);
        //then
        assertTrue(result);
    }

    @Test
    void shouldNotFindACharInText() {
        //given
        char character = 'x';
        String text = "The only way to do great work is to love what you do";
        //when
        boolean result = isASpecificCharacterInTextWhileLoopWithBreakStatement(character, text);
        //then
        assertFalse(result);
    }

    @Test
    void shouldFoundLetterOEightTimesInTheText() {
        //given
        char character = 'o';
        String text = "The only way to do great work is to love what you do";
        //when
        int result = howManyTimesACharacterAppearsInTheTextContinueStatement(character, text);
        //then
        assertEquals(8, result);
    }

    @Test
    void shouldNotFoundLetterZInTheText() {
        //given
        char character = 'z';
        String text = "The only way to do great work is to love what you do";
        //when
        int result = howManyTimesACharacterAppearsInTheTextContinueStatement(character, text);
        //then
        assertEquals(0, result);
    }

    @Test
    void shouldFoundLongestString() {
        //given
        String[] homework = {"if", "for", "for each", "while", "do while", "continue", "break", "switch", "unit tests"};
        //when
        int result = lengthOfLongestStringForEachLoop(homework);
        //then
        assertEquals(8, result);
    }

    @Test
    void shouldReturnZeroWhenArrayOfStringsIsEmpty() {
        //given
        String[] keywords = {};
        //when
        int result = lengthOfLongestStringForEachLoop(keywords);
        //then
        assertEquals(0, result);
    }

    @Test
    void shouldConcatStringsFiveTimesDoWhileLoop() {
        //given
        String str = "Loop";
        int times = 5;
        //when
        String result = concatStringsDoWhileLoop(times, str);
        //then
        assertEquals("LoopLoopLoopLoopLoop", result);
    }


    @Test
    void shouldChangeWeekdayNumberToDayName() {
        //given
        int day = 2;
        //when
        String dayName = changeWeekdayNumberToDayNameSwitch1(day);
        //then
        assertEquals("Tuesday", dayName);
    }


    @Test
    void exceptionShouldBeThrownWhenDayNumberIsNotCorrect() {
        //given
        int day = 8;
        //when
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> changeWeekdayNumberToDayNameSwitch1(8));
        //then
        assertEquals("The number is not correct.", thrown.getMessage());
    }

    @Test
    void shouldChangeWeekdayNumberToDayNameSwitch2() {
        //given
        int day = 3;
        //when
        String dayName = changeWeekdayNumberToDayNameSwitch2(day);
        //then
        assertEquals("Wednesday", dayName);
    }


    @Test
    void exceptionShouldBeThrownWhenDayNumberIsNotCorrectSwitch2() {
        //given
        int day = 0;
        //when
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> changeWeekdayNumberToDayNameSwitch2(8));
        //then
        assertEquals("The number is not correct.", thrown.getMessage());
    }

    @Test
    void shouldChangeWeekdayNumberToDayNameSwitch3() {
        //given
        int day = 7;
        //when
        String dayName = changeWeekdayNumberToDayNameSwitch3(day);
        //then
        assertEquals("Sunday", dayName);
    }


    @Test
    void exceptionShouldBeThrownWhenDayNumberIsNotCorrectSwitch3() {
        //given
        int day = 100;
        //when
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> changeWeekdayNumberToDayNameSwitch3(8));
        //then
        assertEquals("The number is not correct.", thrown.getMessage());
    }

    @Test
    void shouldReturnWeekdayWhenTheDayNumberIsFiveSwitch4() {
        //given
        int day = 5;
        //when
        String result = checkIfWeekdayOrWeekendDaySwitch4(day);
        //then
        assertEquals("Weekday", result);
    }

    @Test
    void shouldReturnWeekendDayWhenTheDayNumberIsSixSwitch4() {
        //given
        int day = 6;
        //when
        String result = checkIfWeekdayOrWeekendDaySwitch4(day);
        //then
        assertEquals("Weekend", result);
    }

    @Test
    void exceptionShouldBeThrownWhenDayNumberIsNotCorrectSwitch4() {
        //given
        int day = 11;
        //when
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> checkIfWeekdayOrWeekendDaySwitch4(8));
        //then
        assertEquals("The number is not correct.", thrown.getMessage());
    }
}
