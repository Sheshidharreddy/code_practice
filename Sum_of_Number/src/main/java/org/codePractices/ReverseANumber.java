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


public Integer reverse(int x){
    int reverse = 0;

       while (x != 0) {
        int digit = x % 10;

        // Check for overflow BEFORE multiplying
        if (reverse > Integer.MAX_VALUE / 10 ||
                (reverse == Integer.MAX_VALUE / 10 && digit > 7)) {
            return 0;
        }
        if (reverse < Integer.MIN_VALUE / 10 ||
                (reverse == Integer.MIN_VALUE / 10 && digit < -8)) {
            return 0;
        }

        reverse = reverse * 10 + digit;
        x /= 10;
    }

        return reverse;
}
}
