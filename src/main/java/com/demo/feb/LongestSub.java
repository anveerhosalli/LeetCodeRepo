package com.demo.feb;

import java.util.Arrays;

public class LongestSub {
    public static void main(String[] args) {
        System.out.println(new LongestSub().sub("abcaby"));
    }
     public int sub(String str){

        int[] arr = new int[str.length()];
        for(int i=0; i<str.length(); i++){
            int count = 0;
            for(int j=0; j<str.length()-1; j++){
                if(str.charAt(j) == str.charAt(j+1)){
                    count++;

                }


            }
            arr[i] = count;
        }
        System.out.println(Arrays.toString(arr));

        return 0;
    }
}
