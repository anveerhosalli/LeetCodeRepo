package com.demo.feb;

public class CheckIfAllA {
    public static void main(String[] args) {
        System.out.println(new CheckIfAllA().checkString("aaaabbbb"));
    }

    public boolean checkString(String s) {
        boolean isA = false;
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'b'){
                isA = true;
            }
            if(isA && s.charAt(i) == 'a'){
                return false;
            }
        }

        return true;
    }
}
