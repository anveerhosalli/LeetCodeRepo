package com.demo.feb;

import java.util.Stack;

public class ClearDigits {

    public static void main(String[] args) {
        System.out.println(new ClearDigits().clearDigits("cbx45"));
    }

    public String clearDigits(String s) {

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c >=0 && c<=9){
                stack.pop();
            }
            else{
                stack.push(c);
            }

        }
       return null;
    }


}