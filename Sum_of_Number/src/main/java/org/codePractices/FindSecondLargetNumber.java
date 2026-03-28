package org.codePractices;
public class FindSecondLargetNumber {
        public static void main(String args[]) {
            int[] arr = {1, 2, 3, 4, 5, 6, 4, 12, 45};
            int maxNumber = arr[0];
            int seconfLargedNumber = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > maxNumber) {
                    seconfLargedNumber = maxNumber;
                    maxNumber = arr[i];
                }
            }
            System.out.println("Second largest number is: " + seconfLargedNumber);
        }
    }


