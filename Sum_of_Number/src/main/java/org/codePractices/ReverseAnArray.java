package org.codePractices;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseAnArray {
public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int start = 0;
    int[] reverseArray = new int[arr.length];

    System.out.println("Length of the array is: " + arr.length);

    for(int i =arr.length; i > 0; i--){
    int realNumber = arr[i-1];
        reverseArray[start] = realNumber;
        start++;
    }
    System.out.println("Reversed array is: " + Arrays.toString(reverseArray));
}

}
