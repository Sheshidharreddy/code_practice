package org.codePractices.list;

import java.util.*;

public class primerCheckWithElseCondition {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        primerCheckWithElseCondition s = new primerCheckWithElseCondition();
        System.out.println(s.checkPoint(N));
        scanner.close();
    }


    public String checkPoint(int n){

        if(n%2 == 0){
            if (2 <= n && n <=5){
                return "Not Weird";
            } else if(6 <= n && n <= 20){
                return "Weird";
            }else {
                return "Not Weird";
            }
        } else {
            return "Weird";
        }
    }
}
