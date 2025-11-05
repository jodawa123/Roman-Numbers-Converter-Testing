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


    public int romanToInt(String s){
        int convertedNumber =0;
        for(int i =0; i<s.length(); i++){
            int currentNumber= map.get(s.charAt(i));
            int next= i+1 < s.length() 
                ? map.get(s.charAt(i+1)) 
                : 0;

            if (currentNumber>= next){
                convertedNumber+=currentNumber;
            }    
            else{
                convertedNumber-= currentNumber;
            }
        }
        return convertedNumber;
    }

    public static void main(String[] args) {
        RomanNumeral converter = new RomanNumeral();
        
        
        System.out.println("Roman Numeral to Integer Conversions:");
        System.out.println("XIV = " + converter.romanToInt("XIV"));      // 14
        System.out.println("XLI = " + converter.romanToInt("XLI"));      // 41
        System.out.println("XCIX = " + converter.romanToInt("XCIX"));    // 99
        System.out.println("DCCLXXXVII = " + converter.romanToInt("DCCLXXXVII")); // 787
    }
}
    


