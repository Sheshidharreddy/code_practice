
package org.codePractices;

import java.util.Arrays;

public class MoveAllZeroToEnd {
public static void main(String[] args){
    int[] arr = {1,2,0,4,0,5,0,60,70,0,3};

    int index = 0;

    // Step 1: Move all non-zero elements forward
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] != 0) {
            arr[index] = arr[i];
            index++;
        }
    }

    // Step 2: Fill remaining positions with zero
    while (index < arr.length) {
        arr[index] = 0;
        index++;
    }

    System.out.println("New array is: " + Arrays.toString(arr));
}

}
