package org.codePractices.list;

import java.util.ArrayList;
import java.util.List;

public class FuzzBuzz {

    public static void main(String[] args){
        int n = 5;

        List<String> list = new ArrayList<>();

        for(int i = 0 ; i <= n; i++){
            if(i % 3 == 0){
                list.add("Buzz");
            }else if(i % 5 == 0){
                list.add("Fuzz");
            }else if(i % 3 == 0 && i % 5 == 0){
                list.add("FuzzBuzz");
        }else{
                list.add(i + "");
            }
        }

        System.out.println("List" +list);
    }
}

