package com.example;
import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

    private static final Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int romanToInt(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }

        int convertedNumber = 0;
        int prevValue = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Check for invalid letters
            if (!map.containsKey(c)) {
                throw new IllegalArgumentException("Invalid Roman numeral character: " + c);
            }

            int currentValue = map.get(c);

            // Check invalid repetition (like VV, LL, DD)
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                if (c == 'V' || c == 'L' || c == 'D') {
                    throw new IllegalArgumentException("Invalid repetition of Roman numeral: " + c);
                }
            }

            // Apply subtractive notation rule
            if (currentValue > prevValue) {
                convertedNumber += currentValue - 2 * prevValue; 
            } else {
                convertedNumber += currentValue;
            }

            prevValue = currentValue;
        }

        return convertedNumber;
    }

    public static void main(String[] args) {
        RomanNumeral converter = new RomanNumeral();

        System.out.println("Roman Numeral to Integer Conversions:");
        System.out.println("XIV = " + converter.romanToInt("XIV"));       // 14
        System.out.println("XLI = " + converter.romanToInt("XLI"));       // 41
        System.out.println("XCIX = " + converter.romanToInt("XCIX"));     // 99
        System.out.println("DCCLXXXVII = " + converter.romanToInt("DCCLXXXVII")); // 787
    }
}
