package org.codePractices;

public class JumpArray {

    public static void main(String args[]){

        JumpArray check = new JumpArray();

        System.out.println("Result for the jump: " +
                check.jumpcode(new int[]{1,2,3,4,5,6}));
    }

    public boolean jumpcode(int[] num){

        int reachable = 0 ;

        for(int i = 0; i < num.length && reachable <= num.length; i++){
            reachable = Math.max(reachable, i + num[i]);
            if(reachable >= num.length){
                return true;
            }
        }
        return false;
    }
}
