package org.codePractices.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupTheAnagram {
        public static void main(String[] args){
            String [] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

            HashMap<String, List<String>> map = new HashMap<>();

            for(String str : arr){
                char [] charArray = str.toCharArray();
                Arrays.sort(charArray);
                String sortedStr = new String(charArray);

                if(!map.containsKey(sortedStr)){
                    map.put(sortedStr, new ArrayList<>());
                }
                map.get(sortedStr).add(str);
            }

            System.out.println("Grouped Anagrams: " + map.values());
        }
}
