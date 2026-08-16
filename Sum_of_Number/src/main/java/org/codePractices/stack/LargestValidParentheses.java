package org.codePractices.stack;

import java.util.Stack;

public class LargestValidParentheses {

    public static void main(String[] args){

        LargestValidParentheses st = new LargestValidParentheses();
        String str = "((()(()))";
        System.out.println("Result of valid parenthesis " + st.vaildParenthese(str));

    }

    public int vaildParenthese(String s){
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                } else{
                    ans = Math.max(ans, i - stack.peek());
                }
            }
        }
        return ans;
    }

    }

