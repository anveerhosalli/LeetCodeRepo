package com.demo.feb;

import java.util.HashMap;

public class BadPair {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        System.out.println(new BadPair().countBadPairs(nums));

    }

    public long countBadPairs(int[] nums) {

        long n = nums.length;

        // Insert & Count matches and add freq where (nums[i] - i) == (nums[j] - j)
        HashMap<Integer, Integer> freq = new HashMap<>();
        long goodPairs = 0;

        for (int i = 0; i < n; ++i) {
            int key = nums[i] - i;
            if (freq.containsKey(key)) {
                goodPairs += freq.get(key);
            }
            freq.put(key, freq.getOrDefault(key, 0) + 1);
        }

        long badPairs = n * (n - 1) / 2 - goodPairs;
        return badPairs;

    }
}
