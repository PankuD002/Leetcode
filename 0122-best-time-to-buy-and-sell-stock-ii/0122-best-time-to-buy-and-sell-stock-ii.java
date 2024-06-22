class Solution {
    public int maxProfit(int[] prices) {
        int size=prices.length;
        int i=1;
        int profit=0;
        while(i<size){
            if(prices[i]-prices[i-1]>0){
                profit+=prices[i]-prices[i-1];
                i++;
            }
            else{
                i++;
            }
        }
        return profit;
    }
}