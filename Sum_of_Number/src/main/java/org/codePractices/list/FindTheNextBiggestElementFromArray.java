package org.codePractices.list;

public class FindTheNextBiggestElementFromArray {
    public static void main(String[] args){

        int[] arr = {4, 5, 2, 25};
        int n = arr.length;
        FindTheNextBiggestElementFromArray obj = new FindTheNextBiggestElementFromArray();
        int max = obj.maxValueArray(arr, n);
        System.out.println("Max value in array is: " + max);

    }

    public int maxValueArray(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max + 1;
    }
}
