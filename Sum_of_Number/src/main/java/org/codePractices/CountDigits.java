package org.codePractices;

public class CountDigits {
    public static void main(String[] args) {
        int n = 1234567890;
        int count = 0;
        int sumnumber = 0;

        while(n!= 0){
        n/=10;
        count++;
        }
        System.out.println("The number of digits is: " + count);

    }
}
