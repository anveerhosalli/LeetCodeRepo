package com.demo.feb;

import java.util.ArrayList;
import java.util.List;

public class SwapCheck {
    public static void main(String[] args) {

        System.out.println(new SwapCheck().areAlmostEqual("npv" , "zpn"));

    }

    public boolean areAlmostEqual(String s1,String s2){

        if(s1.length() != s2.length()) return false;
        if(s1.equals(s2)) return true;
        int x = -1;
        int y = -1;
        int count =0;
       for(int i=0; i<s1.length(); i++){
           if(s1.charAt(i) != s2.charAt(i)){
               count++;
                if(x == -1) x = i;
                else if(y == -1) y = i;
           }
       }

       System.out.println(s1.charAt(x));
        System.out.println(s2.charAt(x));
        System.out.println(s1.charAt(y));
         System.out.println(s2.charAt(y));


       if(count == 2 && s1.charAt(x) == s2.charAt(y) &&  s2.charAt(x) == s1.charAt(y)) return true;
       return false;


    }
}
