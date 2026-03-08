package org.example;

import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the size of the array: ");
        int n  = scanner.nextInt();

        System.out.println("Enter the elements:");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > largest){
                second = largest;
                largest = num;
            } else if(num > second && num != largest){
                second = num;
            }
        }

        System.out.println("Second Largest = " + second);
    }
}
