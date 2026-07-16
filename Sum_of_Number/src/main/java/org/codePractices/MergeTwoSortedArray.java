package org.codePractices;

public class MergeTwoSortedArray {

    public static void main(String[] args){

        MergeTwoSortedArray s = new MergeTwoSortedArray();
        int[] nums1 = {1, 2, 3, 4, 0, 0, 0, 0};
        int[] nums2 = {2, 5, 6, 7};
        int[] result = s.mergeTwoArraysSorted(nums1, 4, nums2, 4);
        for (int num : result) {
            System.out.print(num + " ");
        }


    }

    public int[] mergeTwoArraysSorted(int[] nums1, int m , int[] nums2, int n){
        int p1 = m - 1;
        int p2 = n - 1;
        for(int i = nums1.length -1 ; i >= 0 ; i--){
            int valAtP1 = p1 >= 0 ? nums1[p1] : Integer.MIN_VALUE;
            int valAtP2 = p2 >= 0 ? nums2[p2] : Integer.MIN_VALUE;
            if(valAtP1 < valAtP2){
                nums1[i] = valAtP2;
                p2--;
            }else {
                nums1[i] = valAtP1;
                p1 --;
            }

        }
        return nums1 ;
    }
}
