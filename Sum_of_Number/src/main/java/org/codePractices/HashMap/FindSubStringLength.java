package org.codePractices.HashMap;

import java.util.HashMap;

//Need to find the lenght of substring with sequence non repated letter from string.
public class FindSubStringLength {

    public static void main(String[] args){

        FindSubStringLength value = new FindSubStringLength();
        int result = value.subStringCount("abba");

        System.out.println("answer :" + result);
    }


    public int subStringCount(String s){
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            if(!map.containsKey(ch)){
                map.put(ch,right);
            } else {
                left = Math.max(left, map.get(ch)+1);
                map.put(ch,right);
            }
            ans = Math.max(ans,right-left+1);
        }

        return ans;
    }
}
