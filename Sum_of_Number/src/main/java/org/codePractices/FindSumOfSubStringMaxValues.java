package org.codePractices;

public class FindSumOfSubStringMaxValues {

    public static void main(String[] args){

        FindSumOfSubStringMaxValues s = new FindSumOfSubStringMaxValues();
        int[] nums = {-2,1,-2,1,2,3,4};
        System.out.println("Results: " +s.maxValuesSubArray(nums));

    }

    public int maxValuesSubArray(int[] nums){

        int curr = nums[0];
        int maxValue = nums[0];

        for(int i = 1; i < nums.length; i++){
            curr = Math.max(nums[i], curr + nums[i]);
            maxValue = Math.max(maxValue, curr);
        }
        return maxValue;
    }
}
