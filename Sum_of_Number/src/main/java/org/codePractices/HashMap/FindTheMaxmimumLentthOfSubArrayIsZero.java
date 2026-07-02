package org.codePractices.HashMap;

import java.util.HashMap;

public class FindTheMaxmimumLentthOfSubArrayIsZero {

    public static void main(String[] args){

        FindTheMaxmimumLentthOfSubArrayIsZero sam = new FindTheMaxmimumLentthOfSubArrayIsZero();
        int[] array = {15,-2,  2,-8, 1, 7, 10, 23};
        System.out.println("Max length: " + sam.maxLengthOfArray(array));

    }

    public int maxLengthOfArray(int[] nums){
        int sum = 0;
        int len = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length - 1; i++){
            sum =+ nums[i];
            if(sum == 0){
                len = i + 1;
            }else if(map.containsKey(sum)){
                len = Math.max(len, i - map.get(sum));
            } else {
                map.put(sum, i);
            }

            }
        return len;
        }
}
