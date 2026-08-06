package org.codePractices;

public class FindTheMajorityOfTheAraay {

    public static void main(String[] args){

        FindTheMajorityOfTheAraay s = new FindTheMajorityOfTheAraay();
        int [] n = {1,2,3,4,4,3,2,2,2,2,2,22};
        System.out.println("Result :" + s.findTheMajorityValues(n));
    }

    public int findTheMajorityValues(int nums[]){
        int count = 0;
        int candidate = 0;

        for(int i = 0 ; i < nums.length; i++){
            if(count == 0){
                candidate = nums[i];
            }else if (candidate == nums[i]){
                count++;
            } else {
                count --;
            }
        }

        return candidate;
    }
}
