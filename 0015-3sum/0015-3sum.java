class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int size=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<size;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=size-1;
            while(j<k){
            long sum=(long)nums[i]+nums[j];
            sum+=nums[k];
            if(sum==0){
                List<Integer> temp= Arrays.asList(nums[i],nums[j],nums[k]);
                ans.add(temp);
                j++;k--;
                while(j<k && nums[j]==nums[j-1]) j++;
                while(j<k && nums[k]==nums[k+1]) k--;
            }
                else if(sum<0)j++;
                else k--;
            }
            
        }
        return ans;
    }
}