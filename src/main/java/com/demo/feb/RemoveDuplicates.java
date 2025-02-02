package com.demo.feb;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {

        Set s= new HashSet<>();
        for(Object x : head){
            s.add(x);
        }
        List list = new ArrayList<>();
        list.addAll(s);

        return (ListNode) list;

    }


}

class ListNode extends ArrayList {

}
