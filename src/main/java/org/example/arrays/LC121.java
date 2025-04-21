package org.example.arrays;

public class LC121 {

    public static void main(String[] args) {
        System.out.println("Sold: "+maxProfit(new int[]{1,2}));
    }

    public static int maxProfit(int[] prices) {
        if(prices.length<2){
            return 0;
        }
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else if(prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }

        }

        return maxProfit;


    }

}
