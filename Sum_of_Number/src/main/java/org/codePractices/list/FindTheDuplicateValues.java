package org.codePractices.list;

import java.util.ArrayList;
import java.util.List;

public class FindTheDuplicateValues {
    public static void main(String[] args){

        int[] nums = {4,3,2,7,8,2,3,1};
        FindTheDuplicateValues find = new FindTheDuplicateValues();
        System.out.println("result " +find.findthevaluesrepeated(nums));
    }

    public List<Integer> findthevaluesrepeated(int[] nums){

        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0){
                list.add(Math.abs(nums[i]));
            }if (nums[index] > 0){
                nums[index] = -nums[index];
            }
        }
        return list;
    }
}
