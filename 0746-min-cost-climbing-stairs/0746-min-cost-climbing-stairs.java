class Solution {
    public int cs(int[] arr,int idx,int[] dp){
        //best case
        if(idx==arr.length)return 0;
        if(idx>arr.length) return Integer.MAX_VALUE;
        
        if(dp[idx]!=0)return dp[idx];
        int Single_jump=cs(arr,idx+1,dp);
        int double_jump=cs(arr,idx+2,dp);
                
        dp[idx]=Math.min(Single_jump,double_jump)+arr[idx];

        return Math.min(Single_jump,double_jump)+arr[idx];
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length];
        return Math.min(cs(cost,0,dp),cs(cost,1,dp));
    }
}