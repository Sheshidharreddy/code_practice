package org.codePractices;

public class RemoveTheDuplicateNumberFromArray {
    public static void main(String arg[]){
        int[] arr = {1, 2, 3, 4, 5, 2, 3, 6};
        int[] uniqueArr = removeDuplicates(arr);

        System.out.println("Array with duplicates removed:");
        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return new int[0]; // Return an empty array if input is empty
        }

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j++] = arr[i];
            }
        }

        // Copy the unique elements to a new array of the correct size
        int[] uniqueArr = new int[j];
        System.arraycopy(temp, 0, uniqueArr, 0, j);
        return uniqueArr;
    }
}
