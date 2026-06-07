package org.codePractices.HashMap;

import java.util.HashMap;

public class ArrayCheckRepeatedNums {

    public static void main(String args[]){

        ArrayCheckRepeatedNums a = new ArrayCheckRepeatedNums();
        boolean result = a.containsDuplicate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9,1,2,3});
        System.out.println("Array contains duplicate number: " + result);
    }

    public boolean containsDuplicate(int[] nums){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(map.containsKey(num)){
                return true;
            }
            else {
                map.put(num, 1);
            }
        }
        return false;
    }
}
