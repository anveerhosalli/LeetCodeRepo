package com.demo.feb;

public class StrictlySubarray {
    public static void main(String[] args) {

        int[] nums = {1,3,4};
        System.out.println(new StrictlySubarray().longestMonotonicSubarray(nums));
    }
    public int longestMonotonicSubarray(int[] nums) {

        int gCount =1;
        int ggCount = 1;
        int lCount =1;
        int llCount = 1;
        for (int i=0; i<nums.length-1; i++){
            if(nums[i]<nums[i+1]){
                gCount++;
            }
            if(nums[i] > nums[i+1]){
                lCount++;
            }
            else{
                if(ggCount <= gCount){
                    ggCount = gCount;
                }
                gCount = 1;
                if(llCount <= lCount){
                    llCount = lCount;
                }

                lCount = 1;

            }
        }
        ggCount=Math.max(ggCount,gCount);
        llCount=Math.max(llCount,lCount);


        return Math.max(ggCount,llCount);
    }
}
