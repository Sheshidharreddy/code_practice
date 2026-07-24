package org.codePractices.stack;

import java.util.Arrays;
import java.util.Stack;

public class AsteroIdCollision {

    public static void main(String[] args){

        AsteroIdCollision s = new AsteroIdCollision();
        int[] sq = {-1,2,3,-4,9,6,-1,-8};
     System.out.println("Result :"+ Arrays.toString(s.asteroID(sq)));   ;

    }

    public int[] asteroID(int[] asteroids){
        Stack<Integer> st = new Stack<>();
        for(int asteroid : asteroids){
            if(asteroid > 0 ){
                st.push(asteroid);
            } else{
                while (!st.isEmpty() && st.peek() > 0 && Math.abs(asteroid) > st.peek()){
                    st.pop();
                }
                if(st.isEmpty() || st.peek() < 0){
                    st.push(asteroid);
                } else if (st.peek()  + asteroid == 0) {
                    st.pop();
                }
            }
        }
        int[] ans = new int[st.size()];
        for (int i = ans.length - 1; i >= 0; i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}
