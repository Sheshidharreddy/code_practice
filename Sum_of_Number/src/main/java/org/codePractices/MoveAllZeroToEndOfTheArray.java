package org.codePractices;

import java.util.Arrays;

public class MoveAllZeroToEndOfTheArray {

    public static void main(String[] args){

        int[] test = {1,2,0,4,0,5,0};

        MoveAllZeroToEndOfTheArray move = new MoveAllZeroToEndOfTheArray();
        int[] result = move.moveZero(test);
        System.out.println("Moved all non zeros to end of the array " + Arrays.toString(result));

    }

    public int[] moveZero(int[] arr){
        int left = 0;
        int right = 0;
        int lengthOfArray = arr.length -1 ;
        while (left <= lengthOfArray && right <= lengthOfArray){
            if(arr[right] != 0){
                arr[left] = arr[right];
                right ++;
                left ++;
            } else {
                right ++;
            }
        }
        // Fill the rest with zeros
        while (left < lengthOfArray) {
            arr[left] = 0;
            left++;
        }

        return arr;

    }



}
