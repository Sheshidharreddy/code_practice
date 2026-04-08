package org.codePractices.HashMap;

import java.util.HashMap;

public class FindTheSumOfTwoNumberInArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                System.out.println("Pair found: " + arr[i] + " and " + complement);
            }
            map.put(arr[i], i);
        }
    }
}
