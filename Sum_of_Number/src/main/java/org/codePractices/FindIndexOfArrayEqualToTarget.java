package org.codePractices;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindIndexOfArrayEqualToTarget {
    public static void  main(String[] args){

        FindIndexOfArrayEqualToTarget set = new FindIndexOfArrayEqualToTarget();
        int[] array = {-3,-1,0,3,6,8,10};
       System.out.println("Result of the index: " + Arrays.toString(set.indexOfTheArray(array, 6))  );

    }

    public int[] indexOfTheArray(int[] nums, int target){
    int left = 0 , right = nums.length - 1;

    while(left < right){
        int sumOfPairCount = nums[left] + nums[right];
        if(sumOfPairCount == target){
            break;
        }else if(sumOfPairCount > target){
            right--;
        }else{
            left ++;
        }
    }
        return new int[] {left+1, right+1} ;
    }
}
