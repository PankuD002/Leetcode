class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-min>0){
                profit=Math.max(profit,prices[i]-min);
            }
            else{
                min=Math.min(prices[i],min);
            }
        }
        return profit;
    }
}