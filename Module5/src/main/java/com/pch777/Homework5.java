package com.pch777;

public class Homework5 {
     public static void main(String[] args) {




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
}
