package com.example.leetcodepractice;

public class MajorityElements {
    public int majorityElement(int[] nums) {
        int winCandidate = nums[0], candVotes = 0;
        for(var num : nums){
            if(num == winCandidate){
                candVotes++;
            }
            else{
                candVotes--;
                if(candVotes == 0){
                    candVotes = 1;
                    winCandidate = num;
                }
            }
        }
        return winCandidate;
    }
    public static void main(String[] args) {
//        int nums [] = {3,2,3};
//        int nums [] = {2,2,1,1,1,2,2};
        int nums [] = {2,2,1,3,1,1,4,1,1,5,1,1,6};
        System.out.println(new MajorityElements().majorityElement(nums));
    }
}
