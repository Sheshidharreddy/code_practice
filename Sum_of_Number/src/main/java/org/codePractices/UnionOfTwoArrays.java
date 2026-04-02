package org.codePractices;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr = {6, 7, 3, 4, 5};
        int[] arr1 = {4, 5, 6, 7, 8, 4};

        LinkedHashSet<Integer> uniqueElements = new LinkedHashSet();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if(arr[i] <= arr1[j]){
                    uniqueElements.add(arr[i]);
                    uniqueElements.add(arr1[j]);
                }else{
                    uniqueElements.add(arr1[j]);
                    uniqueElements.add(arr[i]);
                }
            }
        }
        System.out.println("Union of the two arrays: " + uniqueElements);

    }

}
