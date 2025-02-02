package com.demo.feb;

import java.util.HashMap;

public class Tuples {
    public static void main(String[] args) {
        int[] nums = {2,3,4,6};
        System.out.println(new Tuples().tupleSameProduct(nums));
    }

    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> freq = new HashMap<>(); // K -> product, V -> frequency of such pair

        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                int product = nums[i] * nums[j];
                freq.put(product, freq.getOrDefault(product, 0) + 1);
            }
        }

        int count = 0;
        for (int frequency : freq.values()) {
            count += 8 * nc2(frequency);
        }

        return count;
    }

    public int nc2(int f){
        return  (f*(f-1))/2;
    }



}
