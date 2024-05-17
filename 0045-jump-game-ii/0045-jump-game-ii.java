class Solution {
    public int jump(int[] nums) {
        int jump=0;
        int range=0;
        int current=0;
        for(int i=0;i<nums.length-1;i++){
            range=Math.max(range,nums[i]+i);
            
            if(current==i){
                current=range;
                jump++;
            }
        }
        return jump;  
}
}