package org.codePractices.HashMap;

import java.util.AbstractSet;
import java.util.HashSet;

public class FindTheSingleNumberfromArray {
    public static void main(String[] args){

        int [] arr = {1,2,3,4,5,5,6,7,6,7,3};

        FindTheSingleNumberfromArray obj = new FindTheSingleNumberfromArray();

        obj.singleSet(arr);

        obj.xoF(arr);

    }


    public HashSet<Integer> singleSet(int[] arr){

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0 ; i < arr.length; i++){

            if(set.contains(arr[i])){
                set.remove(arr[i]);
            }else {
                set.add(arr[i]);
            }

        }
        System.out.println("Single number " +set);

        return set;
    }
//Only Works when you have single number in the array
    public int xoF (int[] arr){
        int singleNumber =0;
        for(int num : arr){
            singleNumber = singleNumber ^ num;
        }
        System.out.println("Single number used XOF" +singleNumber);
        return singleNumber;
    }
}
