package org.codePractices;

import java.util.Scanner;
import java.util.ServiceConfigurationError;
import java.util.Set;

public class FindSumOfPairsK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values seperated by space: ");

        String[] arr1 = sc.nextLine().split(" ");

        int[] arr = new int[arr1.length];

        for (int k = 0; k < arr1.length; k++) {
            arr[k] = Integer.parseInt(arr1[k]);
        }

        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();

        Set<String> uniquePairs = new java.util.HashSet<>();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    if (arr[i] < arr[j]) {
                        int first = Math.min(arr[i], arr[j]);
                        int second = Math.max(arr[i], arr[j]);

                        String pair = first + "," + second;
                        if (!uniquePairs.contains(pair)) {
                            uniquePairs.add(pair);
                            found = true;
                            System.out.println("Pair found: " + first + " and " + second);

                        }

                    }
                }
            }

        }
        System.out.println("No more pairs found.");
    }
}
