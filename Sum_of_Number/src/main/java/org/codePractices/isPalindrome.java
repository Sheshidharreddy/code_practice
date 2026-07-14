package org.codePractices;

public class isPalindrome {

    public static void main(String[] args){

        isPalindrome s = new isPalindrome();
        String str = "sam mas";

        System.out.println("result: " + s.checkTheStatus(str));

    }

    public boolean checkTheStatus(String s){
        int p = 0 ;
        int p1 = s.length() - 1;

        while (p < p1){
            char ch1 = s.charAt(p);
            char ch2 = s.charAt(p1);
            if(Character.isLetterOrDigit( ch1 ) == false) p++;
            else if (Character.isLetterOrDigit( ch2) == false) p1--;
            else {
                    if (Character.toLowerCase(ch1) != Character.toLowerCase(ch2))
                            return false;
            }
            p++;
            p1--;
        }

        return true;
    }
}
