package org.codePractices;

import java.util.Arrays;

public class RearrangingTheArray {
    public static void main(String[] args){
    int [] arr = {0,1,-1,2,-3,4,-5,6,-7};
    int [] temp = new int[arr.length];

    int j = 0;

    for(int i = 0 ; i < arr.length; i++){
        if(arr[i] < 0){
            temp[j] = arr[i];
            j++;
        }
    }

    for(int i = 0 ; i < arr.length; i++){
            if(arr[i] >= 0){
                temp[j] = arr[i];
                j++;
            }
        }

    System.out.println("Rearranged array" + Arrays.toString(temp));
    }
}
