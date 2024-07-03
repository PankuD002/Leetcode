class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int size=nums.length;
        int cnt=0;
        int lastsmaller=Integer.MIN_VALUE;
        int longest=0;
        for(int i=0;i<size;i++){
            if(nums[i]-1==lastsmaller){
                cnt++;
                lastsmaller=nums[i];
            }
            else if(lastsmaller!=nums[i]){
                cnt=1;
                lastsmaller=nums[i];
            }
            longest=Math.max(longest,cnt);
        }
        return longest;
    }
}