class Solution {
    public int maxProfit(int[] prices) {
       int maxprofit = 0;
       int minprofit = Integer.MAX_VALUE;

       for(int price : prices){
        if(price < minprofit){
            minprofit = price;
        }else {
            maxprofit = Math.max(maxprofit , price - minprofit);
        }
        
       }
       return maxprofit;
    }
}