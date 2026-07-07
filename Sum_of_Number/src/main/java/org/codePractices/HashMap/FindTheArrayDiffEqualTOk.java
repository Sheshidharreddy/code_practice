package org.codePractices.HashMap;

import java.util.HashMap;
import java.util.Map;

public class FindTheArrayDiffEqualTOk {

    public static void main(String[] args) {

        FindTheArrayDiffEqualTOk s = new FindTheArrayDiffEqualTOk();

        System.out.println(s.countOfUniquePairs(new int[]{3, 1, 4, 1, 5}, 2));
        // Output: 2
    }

    public int countOfUniquePairs(int[] nums, int k) {

        if (k < 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int num = entry.getKey();

            if (k == 0) {
                // Need duplicates
                if (entry.getValue() >= 2) {
                    count++;
                }
            } else {
                // Check if num + k exists
                if (map.containsKey(num + k)) {
                    count++;
                }
            }
        }

        return count;
    }
}