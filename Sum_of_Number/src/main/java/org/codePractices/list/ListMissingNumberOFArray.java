package org.codePractices.list;

import java.util.ArrayList;
import java.util.List;

public class ListMissingNumberOFArray {
    public static void main(String[] args){

        ListMissingNumberOFArray map = new ListMissingNumberOFArray();
        int[] result = {1,2,3,4,2,6,8,9,1,2,3};
        System.out.println(map.missingValues(result));
    }

    public List<Integer> missingValues(int[] nums){

        for (int i = 0 ; i < nums.length; i++){
            int index = Math.abs(nums[i] - 1);
            if(nums[index] > 0){
                nums[index] = -1 * nums[index];
            }
        }
        List<Integer> valuesList = new ArrayList<>();
        for(int j = 0 ; j < nums.length; j++){
            if(nums[j] > 0){
                valuesList.add(j+1);
            }
        }
    return valuesList;
    }
}
