package org.codePractices.HashMap;


import java.util.HashMap;
import java.util.Map;

public class FindLessFrequencyOfNumber {
    public static void main(String[] args){
        int [] arr = {1,2,2,3,3,3,4,4,4,4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey((arr[i]))){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else{
                map.put(arr[i], 1);
            }
        }
        for(Integer key : map.keySet()){
            if (map.get(key) == 1){
                 System.out.println("Less frequent number: " + key + " with frequency: " + map.get(key));
            }
        }


//        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//            if(entry.getValue() == 1){
//                System.out.println("Less frequent number: " + entry.getKey() + " with frequency: " + entry.getValue());
//            }
//        }
    }
}
