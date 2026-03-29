package org.codePractices;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string: ");

        String str1 = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String str2 =  scanner.nextLine();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        System.out.println("Printing the characters of the first string: "+ Arrays.toString(arr1));

        if(arr1.length==arr2.length){
            for(int i = 0; i < arr1.length; i++){
                for(int j = 0; j < arr2.length; j++){
                    if(arr1[i] == arr2[j]){
                        break;
                    }
                }
            }
            System.out.println("The strings are anagrams");
        }else{
            System.out.println("The strings are not anagrams");
        }
    }
}
