package org.codePractices;

import java.util.Arrays;

public class MergeSorting {

    public static void main(String[] args) {

        MergeSorting ms = new MergeSorting();
        int[] qua = {5,2,3,1,6,3,6,5};

        System.out.println(Arrays.toString(ms.mergeSorted(qua)));


    }

    public int[] mergeSorted(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        dividingArayy(nums, left, right);
        return nums;
    }

    public void dividingArayy(int[] nunms, int left, int right) {

        if (left < right) {
            int mid = left + (right - left) / 2;
            dividingArayy(nunms, left,mid);
            dividingArayy(nunms, mid +1 , right);
            merge(nunms, left, mid, right);
        }
    }

    public void merge(int[] nums, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] A = new int[n1];
        int[] B = new int[n2];
        for (int i = 0; i < n1; i++){
            A[i] = nums[left+i];
        }
        for(int i = 0; i < n2; i++){
            B[i] = nums[mid+1+i];
        }

        int i = 0, j = 0 , k = left;
        while (i < n1 && j < n2){
            if (A[i] <= B[j]) {
                nums[k++] = A[i++];
            }else {
                nums[k++] = B[j++];
            }
        }
        while (i < n1){
            nums[k++]= A[i++];
        }
        while (j < n2){
            nums[k++] = B[j++];
        }
    }
}
