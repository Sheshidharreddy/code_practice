package org.codePractices;

public class SolutionToFindChar {
    public static void main(String[] args){
        SolutionToFindChar s = new SolutionToFindChar();
      boolean result  = s.canCtract("accdz","acdedc");

      System.out.println("output: " +result );
    }

    public boolean canCtract(String ransomNote, String magazine){
        int[] frequence = new int[26];

        for(int i = 0; i < magazine.length(); i++){
            char c = magazine.charAt(i);
            frequence[c - 'a']++;
        }
        for(int i = 0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            if(frequence[c - 'a'] == 0) return false;
            frequence[c - 'a']--;
        }
        return true;
    }
}
