package com.example.leetcodepractice;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp = n-1;
        for(int i=nums1.length-1;i>=0;i--){
            if(nums1[i]==0 && temp >=0){
                nums1[i]=nums2[temp--];
            }
        }
        for(int i=0;i<nums1.length;i++){
            for(int j=i+1;j<nums1.length;j++){
                if(nums1[i]>nums1[j]){
                    nums1[i]=nums1[i]+nums1[j];
                    nums1[j]=nums1[i]-nums1[j];
                    nums1[i]=nums1[i]-nums1[j];
                }
            }
        }
        System.out.println(nums1.toString());
    }

    public static void main(String[] args) {
        int nums1[] = {0}; int m = 0;
        int nums2[] = {1}; int n = 1;
        MergeSortedArray obj = new MergeSortedArray();
        obj.merge(nums1,m,nums2,n);
    }
}
