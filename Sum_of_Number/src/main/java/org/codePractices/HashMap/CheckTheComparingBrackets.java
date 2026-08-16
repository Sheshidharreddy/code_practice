package org.codePractices.HashMap;

import java.util.HashMap;
import java.util.Stack;

public class CheckTheComparingBrackets {


    public static void main(String[] args){
        CheckTheComparingBrackets s = new CheckTheComparingBrackets();
        String str = "{()}";
        System.out.println("Result : " + s.checkTheBrackets(str));
    }

    public boolean checkTheBrackets(String str){

        HashMap<Character, Character> map = new HashMap<>();

        Stack<Character> stack = new Stack<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                stack.push(ch);
            } else {
                if(stack.isEmpty() || map.get(stack.pop()) != ch){
                    return false;
                }

            }
        }

        return stack.isEmpty();

    }
}
