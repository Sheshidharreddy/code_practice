package org.codePractices;

public class CheckIfNumberIsPrime {
    public static void main(String[] args) {
        int n = 22;
        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }else{
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false; // n is divisible by a number other than 1 and itself
                }
            }

            return true; // n is a prime number

        }
    }
}
