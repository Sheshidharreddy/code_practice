package org.codePractices.hashSet;

import java.util.HashSet;

public class FindArrayDuplicate {

    public static void main(String args[]){

        FindArrayDuplicate find = new FindArrayDuplicate();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        boolean result = find.containsDuplicate(nums);
        System.out.println("result " +result);

    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true; // Duplicate found
            }
            set.add(num);
        }
        return false; // No duplicates found
    }
}
