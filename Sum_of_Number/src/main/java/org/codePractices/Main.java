package org.codePractices;

public class Main {
    public static void main(String[] args) {

        int n = 1000;
        int sum = 0;

        for (int i = 0; i < n; i++){
            sum += i;
        }
        System.out.println("The sum of the first " + n + " numbers is: " + sum);
    }
}