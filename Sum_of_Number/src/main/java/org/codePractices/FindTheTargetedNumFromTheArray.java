package org.codePractices;

public class FindTheTargetedNumFromTheArray {

    public static void main (String[] args){

        FindTheTargetedNumFromTheArray find = new FindTheTargetedNumFromTheArray();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        int result = find.findtrgaetNum(arr,target);
        System.out.println("result "  +result);

    }

    public int findtrgaetNum(int[] arr, int target){
        int left =  0;
        int right = arr.length -1;

        while(left <= right){
            int mid = left +(right - left ) / 2;
            if(arr[mid] == target){
                return arr[mid];
            } else if (arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
