package org.codePractices;

public class FindTheLastWordLength {

    public static void main(String args[]){

        FindTheLastWordLength findTheLastWordLength = new FindTheLastWordLength();
        String s = "Hello Worldjbsjs fdkhfasjkdfha kjsfhaskjhaskjfdsa f asjkfhaskhasjfnsk sjf  fd shask ";
        int result = findTheLastWordLength.lengthOfLastWord(s);
        System.out.println("result " + result);
    }

    public int lengthOfLastWord(String s){
        int right = s.length() - 1;
        while (right >= 0 && s.charAt(right) == ' '){
            right--;
        }
        int left = right;
        while (left >= 0 && s.charAt(left) != ' '){
            left--;
        }
        return right - left;
    }
}
