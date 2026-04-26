package org.codePractices.HashMap;

import java.util.HashMap;

public class RomanToInteger {

    public static void main (String[] args){

        RomanToInteger romanToInt = new RomanToInteger();
         int value =  romanToInt.romanToInteger("MCMXCIV");

         System.out.println("Roman to Integer " + value);
//Example MMIVSRD

    }

    public int romanToInteger(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L',50);
        map.put('C',100);
        map.put('D', 500);
        map.put('M',1000);

        int n = str.length();
        int result = 0;

        for(int i = 0 ; i < n; i++) {
            if (i < n - 1 && map.get(str.charAt(i)) < map.get(str.charAt(i + 1))) {
                result = result - map.get(str.charAt(i));
            } else {
                result = result + map.get(str.charAt(i));
            }
        }
        return result;

    }
}
