package org.codePractices.list;

import java.util.ArrayList;
import java.util.List;

public class SequenceOfNumbers {

    public static void main(String args[]){
        SequenceOfNumbers sq = new SequenceOfNumbers();
       System.out.println(sq.sequenceNumber(1000,300000));
    }

    public List<Integer> sequenceNumber(int low, int high){

        String s = "123456789";
        List<Integer> values = new ArrayList<>();

        for (int i = 1; i <= 9 ; i++){
            for (int j = 0 ; i + j <= 9; j++){
                int temp = Integer.parseInt(s.substring(j , i+j));
                if (temp >= low && temp <= high){
                    values.add(temp);
                }
            }
        }
        return values;
    }
}
