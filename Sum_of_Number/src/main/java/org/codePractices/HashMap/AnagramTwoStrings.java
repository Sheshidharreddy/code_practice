package org.codePractices.HashMap;

import java.util.HashMap;

public class AnagramTwoStrings {
    public static void main(String[] args){
    String s1 = "hello";
    String s2 = "olles";

    if(s1.length() == s2.length()){

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0 ; i < s1.length(); i++){
            char ch1 = s1.charAt(i);
            map1.put(ch1, map1.getOrDefault(ch1,0)+1);
        }

        for(int i = 0 ; i < s1.length(); i++){
            char ch2 = s2.charAt(i);
            map2.put(ch2, map2.getOrDefault(ch2,0)+1);
        }

        if(map1.equals(map2)){
            System.out.println("Given strings are Anagram");
        }else{
            System.out.println("Given String are not Anagram");
        }
    } else{
        System.out.println("Given String are not Anagram");
        }
    }
}
