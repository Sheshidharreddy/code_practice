package org.codePractices;

public class FindTheMostFirstMissingPostiveNumber {

    public static void main(String args[]) {

        FindTheMostFirstMissingPostiveNumber findTheMostFirstMissingPostiveNumber = new FindTheMostFirstMissingPostiveNumber();
        int[] nums = {3, 4, -1, 1};
        System.out.println("result " + findTheMostFirstMissingPostiveNumber.firstMissingPositive(nums));
    }

    public int firstMissingPositive(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                nums[i] = nums.length + 1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i] - 1);
            if (index < nums.length && nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }
}
