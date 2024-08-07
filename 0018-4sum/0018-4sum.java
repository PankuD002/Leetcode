class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int size=nums.length;
        for(int i=0;i<size;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<size;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int k=j+1;
                int l=size-1;
                while(k<l){
                    long sum=(long)nums[i]+nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    if(target==sum){
                        List<Integer> temp= Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        ans.add(temp);
                        k++;l--;
                        while(k<l && nums[k]==nums[k-1]) k++;
                        while(k<l && nums[l]==nums[l+1]) l--;
                    }
                    else if(sum<target) k++;
                    else l--;
                }
            }
        }
        return ans;
    }
}