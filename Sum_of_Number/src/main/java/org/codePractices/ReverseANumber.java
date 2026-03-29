package org.codePractices;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to reverse: ");

        int n = scanner.nextInt();
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            n /= 10; // Remove the last digit
        }
        System.out.println("Reversed number: " + reversed);

        scanner.close();
        }
}
