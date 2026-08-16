package org.codePractices;

public class FindTheSubStringFromString {

    public static void main(String [] args){

        FindTheSubStringFromString s = new FindTheSubStringFromString();
        System.out.println("Result : " + s.checkTheSubString("asxbdkf", "abc"));

    }

    public boolean checkTheSubString(String str, String subStr){
        int p1 = 0;
        int p2 = 0;
        while (p1 < subStr.length() && p2 < str.length() ){
            if (subStr.charAt(p1) == str.charAt(p2)) {
                p1++;
                p2++;
            }else {
                p2++;
            }
        }
        return p1 == subStr.length();
    }
}
