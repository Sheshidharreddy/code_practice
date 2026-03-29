package org.codePractices;

public class FactorialNumber {
    public static void main(String[] args){
    int n = 10 ;
    int factorial = 1;
    for(int i = 0; i < n ; i++){
     int realNumber = n - i;
        factorial*= realNumber;
    }

    System.out.println("The factorial of " + n + " is: " + factorial);
    }
}


