package org.codePractices;

public class inversionCountOfSortedArray {

    public static void main(String[] args){

        inversionCountOfSortedArray s = new inversionCountOfSortedArray();
        long[] t = {5,4,3,2,1};

        System.out.println(s.inversionCount(t));


    }

    public long inversionCount(long [] nums){
        int l = 0;
        int r = nums.length - 1;
       return mergeSort(nums, l, r);

    }

    public static long mergeSort(long[] nums, int l, int r) {

        long count = 0;
        if (l < r) {
            int mid = l + (r - l) / 2;
            count += mergeSort(nums, l, mid );
            count += mergeSort(nums, mid + 1, r);
            count += merge(nums, l, mid, r);
        }
        return count;
    }

    public static long merge(long[] nums, int l, int mid, int r){
        int n1 = mid - l + 1;
        int n2 = r - mid;
        long [] A = new long[n1];
        long [] B = new long[n2];
        for(int i = 0 ; i < n1 ; i++){
           A[i] = nums[l + i];
        }
        for (int i = 0; i < n2 ; i++){
            B[i] = nums[mid + 1 + i];
        }
        long count = 0;
        int i = 0, j =0 , k = l;
        while ( i < n1 && j < n2){
            if(A[i] > B[j]){
            count += mid - (l + i) + 1;
            nums[k++] = B[j++];
            } else{
                nums [k++] =  A[i++];
            }
        }
        while (i < n1) nums[k++] = A[i++];
        while (j < n2) nums[k++] = B[j++];
        return  count;
    }

}
