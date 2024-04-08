class Solution {
    public int removeElement(int[] nums, int val) {
        int k=nums.length;
        int j=0;
        for(int i=0;i<k;i++){
            if(val!=nums[i]){
                nums[j]=nums[i];
                j++;
            }
        }
        Arrays.sort(nums,0,j);
        return j;
    }
}