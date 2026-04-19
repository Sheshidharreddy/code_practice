package org.codePractices.HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class FindTheSingleNumberfromArray {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,5,6,7,6,7,3};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0 ; i < arr.length; i++){

            if(set.contains(arr[i])){
               set.remove(arr[i]);
            }else {
                set.add(arr[i]);
            }

        }
        System.out.println("Single number " +set);
    }
}
