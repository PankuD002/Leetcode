class Solution {
   public int majorityElement(int[] nums) {
     Arrays.sort(nums);
        return nums[nums.length/2];
    }
    /*
    public int majorityElement(int [] nums){
        int ret=0;
        Map<Integer,Integer> maps =new HashMap<Integer,Integer>();
        for(int num:nums){
            if(!maps.containsKey(num)){
                maps.put(num,1);
            }
            else{
                maps.put(num,maps.put(num)+1);
            }
            if(maps.get(num)>nums.length/2){
                ret=num;
                break;
            }
        }
        return ret;
    }*/
}