package org.codePractices;

public class FindThePrefixOfArray {
    public static void main(String[] args){

        FindThePrefixOfArray find = new FindThePrefixOfArray();
        String [] nam = {"Flower", "Flow", "Fruite"};
        String result = find.perfixOftheArray(nam);

        System.out.println("Prefix of given array: " + result);

    }

    public String perfixOftheArray(String[] strs){

        if (strs == null || strs.length == 0){return "";}

        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++){

            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0 , prefix.length() - 1);
                if(prefix.isEmpty()){return "" ;}
            }
        }
    return prefix;
    }

}
