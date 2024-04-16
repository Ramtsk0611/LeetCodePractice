package com.example.leetcodepractice;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int [] maxArray = new int[prices.length];
        int mx = Integer.MIN_VALUE;
        for(int i=prices.length-1;i>=0;i--){
            if(prices[i] > mx){
                mx = prices[i];
            }
            maxArray[i]=mx;
        }
        mx = Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            int diff = maxArray[i]-prices[i];
            if(diff>mx){
                mx = diff;
            }
        }
        return mx;
    }

    public static void main(String[] args) {
//        int array1 [] = {7,1,5,3,6,4};
        int array1 [] = {7,6,4,3,1};
        BestTimeToBuyAndSellStock obj = new BestTimeToBuyAndSellStock();
        System.out.println(obj.maxProfit(array1));
    }
}
