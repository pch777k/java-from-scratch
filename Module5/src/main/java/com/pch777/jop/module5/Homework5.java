package com.pch777.jop.module5;

public class Homework5 {
    public static void main(String[] args) {

        String text = "Write once, run everywhere";
        char[] chars = {'b', 'r', 'e', 'a', 'k'};
        String[] homework = {"if", "for", "for each", "while", "do while", "continue", "break", "switch", "unit tests"};
        int times = 4;
        int[] dayNumber = {1,2,3,4,5,6,7};

        System.out.println("Is character " + chars[1] + " in text? " + isASpecificCharacterInTextForLoopWithBreak(chars[1], text));
        System.out.println("Is character " + chars[0] + " in text? " + isASpecificCharacterInTextForLoopWithBreak(chars[0], text));

        System.out.println("Is character " + chars[2] + " in text? " + isASpecificCharacterInTextWhileLoopWithBreakStatement(chars[2], text));
        System.out.println("Is character " + chars[4] + " in text? " + isASpecificCharacterInTextWhileLoopWithBreakStatement(chars[4], text));

        System.out.println("Concat string \"" + text.substring(12, 16) + "\" " + times + " times: " + concatStringsDoWhileLoop(times, text.substring(12, 16)));

        System.out.println("How many times character \'" + chars[2] + "\' appears in text? " + howManyTimesACharacterAppearsInTheTextContinueStatement(chars[2], text));
        System.out.println("How many times character \'" + chars[3] + "\' appears in text? " + howManyTimesACharacterAppearsInTheTextContinueStatement(chars[3], text));

        System.out.println("Length of longest string: " + lengthOfLongestStringForEachLoop(homework));
        System.out.println("The " + dayNumber[0] + " day of the week is : " + changeWeekdayNumberToDayNameSwitch1(dayNumber[0]));
        System.out.println("The " + dayNumber[3] + " day of the week is : " + changeWeekdayNumberToDayNameSwitch2(dayNumber[3]));
        System.out.println("The " + dayNumber[5] + " day of the week is : " + changeWeekdayNumberToDayNameSwitch3(dayNumber[5]));

        System.out.println("The " + changeWeekdayNumberToDayNameSwitch2(dayNumber[4]) + "  is : " + checkIfWeekdayOrWeekendDaySwitch4(dayNumber[4]));
        System.out.println("The " + changeWeekdayNumberToDayNameSwitch3(dayNumber[6]) + "  is : " + checkIfWeekdayOrWeekendDaySwitch4(dayNumber[6]));

        System.out.println("The " + changeWeekdayNumberToDayNameSwitch2(dayNumber[1]) + "  is : " + checkIfWeekdayOrWeekendDayIfElse(dayNumber[1]));
        System.out.println("The " + changeWeekdayNumberToDayNameSwitch3(dayNumber[5]) + "  is : " + checkIfWeekdayOrWeekendDayIfElse(dayNumber[5]));
    }


    static boolean isASpecificCharacterInTextForLoopWithBreak(char letter, String text) {
        boolean isFound = false;
        for(int i = 0; i < text.length(); i++) {
            if(letter == text.charAt(i)) {
                isFound = true;
                break;
            }
        }
        return isFound;
    }

    static boolean isASpecificCharacterInTextWhileLoopWithBreakStatement(char letter, String text) {
        boolean isFound = false;
        int i = 0;
        while(i < text.length()) {
            if(letter == text.charAt(i)) {
                isFound = true;
                break;
            }
            i++;
        }
        return isFound;
    }

    static String concatStringsDoWhileLoop(int times, String text) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        if(times > 0) {
            do {
                stringBuilder.append(text);
                i++;
            } while (i < times);
        }
        return stringBuilder.toString();
    }

    static int howManyTimesACharacterAppearsInTheTextContinueStatement(char letter, String text) {
        int counter = 0;
        for(int i = 0; i < text.length(); i++) {
            if(letter != text.charAt(i)) {
                continue;
            }
            counter++;
        }
        return counter;
    }

    static int lengthOfLongestStringForEachLoop(String[] strings) {
        int longestString = 0;
        for(String str : strings) {
            if(str.length() > longestString) {
                longestString = str.length();
            }
        }
        return longestString;
    }

    static String changeWeekdayNumberToDayNameSwitch1(int day) {
        String nameOfDay = "";
        switch (day) {
            case 1: nameOfDay = "Monday"; break;
            case 2: nameOfDay = "Tuesday"; break;
            case 3: nameOfDay = "Wednesday"; break;
            case 4: nameOfDay = "Thursday"; break;
            case 5: nameOfDay = "Friday"; break;
            case 6: nameOfDay = "Saturday"; break;
            case 7: nameOfDay = "Sunday"; break;
            default: throw new IllegalArgumentException("The number is not correct.");
        }
        return nameOfDay;

    }

    static String changeWeekdayNumberToDayNameSwitch2(int day) {
        String nameOfDay = "";
        switch (day) {
            case 1 -> nameOfDay = "Monday";
            case 2 -> nameOfDay = "Tuesday";
            case 3 -> nameOfDay = "Wednesday";
            case 4 -> nameOfDay = "Thursday";
            case 5 -> nameOfDay = "Friday";
            case 6 -> nameOfDay = "Saturday";
            case 7 -> nameOfDay = "Sunday";
            default -> throw new IllegalArgumentException("The number is not correct.");
        }
        return nameOfDay;

    }

    static String changeWeekdayNumberToDayNameSwitch3(int day) {
        return switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> throw new IllegalArgumentException("The number is not correct.");
        };
    }

    static String checkIfWeekdayOrWeekendDaySwitch4(int day) {
        return switch (day) {
            case 1,2,3,4,5 -> "Weekday";
            case 6,7 -> "Weekend";
            default -> throw new IllegalArgumentException("The number is not correct.");
        };
    }

    static String checkIfWeekdayOrWeekendDayIfElse(int day) {
        String result = "";
        if(day > 0 && day <= 5) {
            result += "Weekday";
        } else if (day > 5 && day <= 7){
            result += "Weekend";
        } else {
            throw new IllegalArgumentException("The number is not correct.");
        }
        return result;
    }
}
