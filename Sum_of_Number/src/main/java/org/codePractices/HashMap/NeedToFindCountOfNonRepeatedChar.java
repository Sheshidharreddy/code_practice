package org.codePractices.HashMap;

import java.util.HashMap;

public class NeedToFindCountOfNonRepeatedChar {
    public static void main(String[] args){
    String s = "aaaabasahakjhkajhklaheuhkdfsfdaas";

    char[] ch = s.toCharArray();
    HashMap<Character, Integer> map = new HashMap<>();

    int count = 0;

    for(int i = 0; i < ch.length; i++){
        if(!map.containsKey(ch[i])){
        map.put(ch[i],1);
        count++;
        }
    }
    System.out.println("Non repeated char in string " + count);
    }

}
