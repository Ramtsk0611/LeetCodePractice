package com.example.leetcodepractice;

import java.util.Arrays;

public class RemoveElements {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]!=val){
                nums[count] = nums[i];
                count++;
            }
        }
        nums = Arrays.copyOf(nums,count);
        return count;
    }
    public static void main(String[] args) {
        int [] nums = {0,1,2,2,3,0,4,2}; int val = 2;
//    int [] nums = {3,2,2,3};int val = 3;
//        int [] nums = {4,4,0,1,0,2}; int val = 0;
        RemoveElements obj = new RemoveElements();
        System.out.println(obj.removeElement(nums,val));
    }
}
