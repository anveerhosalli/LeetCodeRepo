package com.demo.feb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToList {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(2,4,3);
        List<Integer> l2 = Arrays.asList(5,6,4);
        List<Integer> l3 = new ArrayList<>();

        int size = Math.max(l1.size() ,l2.size());
        for(int i=size-1; i>=0;i--){
            int x = l1.get(i) +l2.get(i);
            if( x>= 10){
                
            }
            else{

            }
        }
    }
}
