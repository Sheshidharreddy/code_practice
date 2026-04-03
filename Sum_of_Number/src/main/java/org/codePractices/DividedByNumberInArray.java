package org.codePractices;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DividedByNumberInArray {
    public static void main(String[] args){
    int [] arr1 = {1,2,3,4,5,6,7,8,12,10};
    int k = 3;

    int [] temp = new int[arr1.length];
    int j = 0;

    for (int i = 0; i < arr1.length; i++){
        if(arr1[i] % 3 !=0){
            temp[j] = arr1[i];
            j++;
        }
    }
        for (int i = 0; i < arr1.length; i++){
            if(arr1[i] % 3 == 0){
                temp[j] = arr1[i];
                j++;
            }
        }
    System.out.println( Arrays.toString(temp));

    }
}
