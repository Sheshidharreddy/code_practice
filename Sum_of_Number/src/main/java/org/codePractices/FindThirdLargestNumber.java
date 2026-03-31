package org.codePractices;

public class FindThirdLargestNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            } else if (arr[i] > thirdLargest && arr[i] < secondLargest) {
                thirdLargest = arr[i];

            }

        }
        System.out.println("Second largest: " + secondLargest);
        System.out.println("Third largest: " + thirdLargest);
    }
}
