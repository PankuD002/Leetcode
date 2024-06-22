class Solution {
    private void permution(int[] array, List<Integer> dp, boolean[] list, List<List<Integer>> result){
        if(dp.size()==array.length){
            result.add(new ArrayList<>(dp));
            return;
        }
        for(int i=0;i<array.length;i++){
            if(list[i]) continue;
            if(i>0 && !list[i-1] && array[i-1]==array[i]) continue;
            list[i]=true;
            dp.add(array[i]);
            permution(array,dp,list,result);
            list[i]=false;
            dp.remove(dp.size()-1);
        }
        
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> dp =new ArrayList<>();
        boolean[] List = new boolean[nums.length];
        permution(nums,dp,List,result);
        return result;
    }
}