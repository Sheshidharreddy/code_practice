package org.codePractices.hashSet;

import java.util.HashSet;
import java.util.Scanner;

public class FindRepeatedNumberFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int[] arr1 = new int[scanner.nextInt()];

        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int[] arr2 = new int[scanner.nextInt()];

        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }

        HashSet<Integer> map = new HashSet<>();
        HashSet<Integer> repeatedNumbers = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            map.add(arr1[i]);
        }
        for (int i : arr2) {
            if (map.contains(i)) {
              repeatedNumbers.add(i);
            }
        }
        System.out.println("Repeated numbers: " + repeatedNumbers);
    }
}
