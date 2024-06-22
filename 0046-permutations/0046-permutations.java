class Solution {
    private void permution(int[] array,List<Integer> ds,List<List<Integer>> result, boolean []freq){
        if(ds.size()==array.length){
            result.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<array.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(array[i]);
                permution(array,ds,result,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> ds = new ArrayList<>();
        List<List<Integer>> result =new ArrayList<>();
        boolean freq[]= new boolean[nums.length];
        permution(nums,ds,result,freq);
        return result;
        
    }
}