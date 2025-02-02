package com.demo.feb;

public class RemoveAll {
    public static void main(String[] args) {

        System.out.println(new RemoveAll().removeOccurrences("aabababa" , "aba"));
    }
    public String removeOccurrences(String s, String part) {

        int x = s.length();
        for (int i=0; i<x; i++){
            if(s.contains(part)){
                s =  s.replaceFirst(part , "");
            }
        }
        return s;

    }
}
