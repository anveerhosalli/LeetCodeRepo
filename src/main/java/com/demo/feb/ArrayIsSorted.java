package com.demo.feb;



public class ArrayIsSorted {
    public static void main(String[] args) {

        int[] arr = {3,4,5,1,2};
        System.out.println(new ArrayIsSorted().check(arr));

    }

    public boolean check(int[] nums){
        //A[i] == B[(i+x) % A.length]
        //System.out.println(nums[(2 + 3) % nums.length]);
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j]  = temp;
                    count++;
                    System.out.println(count);
                }
            }
        }


        return false;
    }
}
