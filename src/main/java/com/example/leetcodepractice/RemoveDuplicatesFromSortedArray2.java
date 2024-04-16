package com.example.leetcodepractice;

public class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        int count=0; int index = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                count++;
            } else {
                count = 0;
            }
            if(count<=1){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
//        int nums[] = {1, 1};
//        int nums[] = {0,0,0,1,1,1,1,2,2,2,3,3,4};
//        int nums [] = {1,1};
        int nums [] = {1,1,2};
        System.out.println(new RemoveDuplicatesFromSortedArray2().removeDuplicates(nums));
    }
}
