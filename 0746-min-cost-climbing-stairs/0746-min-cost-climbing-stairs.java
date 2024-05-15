class Solution {
   /* public int cs(int[] arr,int idx,int[] dp){
        //best case
        if(idx==arr.length)return 0;
        if(idx>arr.length) return Integer.MAX_VALUE;
        
        if(dp[idx]!=0)return dp[idx];
        int Single_jump=cs(arr,idx+1,dp);
        int double_jump=cs(arr,idx+2,dp);
                
        dp[idx]=Math.min(Single_jump,double_jump)+arr[idx];

        return Math.min(Single_jump,double_jump)+arr[idx];
    }*/
    public int cst(int[]arr,int[]dp){
        for(int i=arr.length-1;i>=0;i--){
            int ip1 = i+1 ==arr.length? 0:dp[i+1];
            int ip2;
            if(i+2==arr.length) ip2= 0;
            else if(i+2>arr.length) ip2= Integer.MAX_VALUE;
            else ip2= dp[i+2];
            
            dp[i]=Math.min(ip1,ip2)+arr[i];
        }
        return Math.min(dp[0],dp[1]);
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length];
        //return Math.min(cs(cost,0,dp),cs(cost,1,dp));
        return cst(cost,dp);
    }
}