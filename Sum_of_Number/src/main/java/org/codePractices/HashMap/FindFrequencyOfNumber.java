package org.codePractices.HashMap;

import com.sun.source.tree.NewArrayTree;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfNumber {
    public static void main(String[] args){
    int[] arr = {1,2,3,3,4,4,4,5,5,5,5};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
        if(map.containsKey(arr[i])){
            map.put(arr[i], map.get(arr[i]) + 1);
        }
        else{
            map.put(arr[i], 1);
        }
        }
        int maxFrequency = 0;
        int maxNumber = arr[0];

        // Find most frequent number
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                maxNumber = entry.getKey();
            }
        }
        System.out.println("Most frequent number: " + maxNumber + " with frequency: " + maxFrequency);

    }
}
