class Solution {
    public int minDifference(int[] nums) {
        int size=nums.length;
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        if(size<5) return 0;
        for(int i=0;i<4;++i){
            min=Math.min(min,nums[size-4+i]-nums[i]);
        }
        return min;
    }
}