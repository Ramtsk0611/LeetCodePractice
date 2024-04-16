package com.example.leetcodepractice;

public class RotateArrayBasedInput {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        // reverse complete arrya
        reverseArray(nums, 0, nums.length-1);
        // reverse left part of array excluding kth element
        reverseArray(nums, 0, k-1);
        // reverse right part of array starting with kth element
        reverseArray(nums, k, nums.length-1);
        for(int value:nums){
            System.out.print(value+"-----");
        }
    }
    public void reverseArray(int[] a, int l, int r){
        while(l <= r){
            int t = a[l];
            a[l] = a[r];
            a[r] = t;
            l++; r--;
        }
    }

    public static void main(String[] args) {
        RotateArrayBasedInput obj = new RotateArrayBasedInput();
//        int nums []  = {1,2,3,4,5,6,7};
        int nums []  = {1,2,3,4,5,6};
        obj.rotate(nums, 3);
    }
}
