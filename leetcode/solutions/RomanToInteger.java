package leetcode.solutions;

public class RomanToInteger {
    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();

        // Example 1
        String input_1 = "III";
        System.out.println(romanToInteger.romanToInt(input_1)); // 3

        // Example 2
        String input_2 = "LVIII";
        System.out.println(romanToInteger.romanToInt(input_2)); // 58

        // Example 3
        String input_3 = "MCMXCIV";
        System.out.println(romanToInteger.romanToInt(input_3)); // 1994
    }

    public int romanToInt(String s) {
        int result = 0, currentNum = 0, previousNum = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'M' -> currentNum = 1000;
                case 'D' -> currentNum = 500;
                case 'C' -> currentNum = 100;
                case 'L' -> currentNum = 50;
                case 'X' -> currentNum = 10;
                case 'V' -> currentNum = 5;
                case 'I' -> currentNum = 1;
            }
            if (currentNum < previousNum) {
                result -= currentNum;
            } else {
                result += currentNum;
            }
            previousNum = currentNum;
        }
        return result;
    }
}
