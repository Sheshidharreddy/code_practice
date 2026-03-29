package org.codePractices;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 33, 4, 4, 5, 6, 6, 89, 89, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] temp = new int[arr.length];

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
             if (isDuplicate == false) {
                {
                    temp[count] = arr[i];
                    count++;
                }

            }
        }
        System.out.println("Array after removing duplicate is: " + Arrays.toString(Arrays.copyOf(temp, count)));
    }
}
