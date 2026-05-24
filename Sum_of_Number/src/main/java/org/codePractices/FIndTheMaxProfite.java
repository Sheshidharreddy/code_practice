package org.codePractices;

public class FIndTheMaxProfite {

    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};
        int result = findMaxProfit(arr);
        System.out.println("result " +result);
    }

    public static int findMaxProfit(int[] arr){

        int left = 0;
        int maxProfit = 0;
        for(int right =  1; right < arr.length; right++){
            int profit = arr[right] - arr[left];
            if(profit > maxProfit){
                maxProfit = profit;
            }
            if(arr[right] < arr[left]){
                left = right;
            }
        }
        return maxProfit;
    }
}
