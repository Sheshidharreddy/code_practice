package org.codePractices;

public class FindTheMajorityOfTheAraay {

    public static void main(String[] args){

        FindTheMajorityOfTheAraay s = new FindTheMajorityOfTheAraay();
        int [] n = {2,3,4,2,2,3,3,3,6,6,6,6,6,6,6,6};
        System.out.println("Result :" + s.findTheMajorityValues(n));
    }

    public int findTheMajorityValues(int nums[]){
        int count = 1;
        int candidate = nums[0];

        for(int i = 1 ; i < nums.length; i++){
            if(candidate == nums[i]){
                count++;
            } else if (candidate!=count){
                count--;
                candidate = nums[i];
            }
        }

        return candidate;
    }
}
