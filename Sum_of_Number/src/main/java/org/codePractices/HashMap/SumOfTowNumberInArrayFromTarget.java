package org.codePractices.HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class SumOfTowNumberInArrayFromTarget {

    public static void main(String[] args){

        SumOfTowNumberInArrayFromTarget s = new SumOfTowNumberInArrayFromTarget();
       int[] result =  s.sumofTwoNumberIndex(new int[]{1, 2, 4, 5}, 7);

       System.out.println("Index of the number in array by adding tow number and generated target"+ Arrays.toString(result));

    }

    public int[] sumofTwoNumberIndex(int[] arr, int target){
        int [] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int diff = target - arr[i];
             if (map.containsKey(diff)){
                 ans[0] = i;
                 ans[1] = map.get(diff);
                 break;
             } else {
                 map.put(arr[i], i);
             }
        }
        return ans;
    }
}
