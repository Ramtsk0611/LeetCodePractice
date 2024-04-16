package com.example.leetcodepractice;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray1 {
    public int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i] == nums[i+1]){
                continue;
            }
            nums[count] = nums[i];
            count++;
        }
        nums = Arrays.copyOf(nums, count);
        return count;
    }

    public static void main(String[] args) {
//        int nums[] = {1, 1, 2};
//        int nums[] = {0,0,1,1,1,2,2,3,3,4};
//        int nums [] = {1,1};
        int nums [] = {1,2};
        System.out.println(new RemoveDuplicatesFromSortedArray1().removeDuplicates(nums));
    }
}
