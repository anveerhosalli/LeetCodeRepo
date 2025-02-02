package com.demo.feb;

public class FindTheIndex {
    public static void main(String[] args) {
        System.out.println(new FindTheIndex().strStr("abc" , "C") );
    }
    public int strStr(String haystack, String needle) {
        if(haystack.equals(needle)) return 0;

        for(int i=0; i<=haystack.length()-needle.length();i++){
            if(haystack.substring(i,i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
