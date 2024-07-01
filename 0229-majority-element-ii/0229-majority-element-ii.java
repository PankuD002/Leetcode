class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> element=new ArrayList<>();
        Map<Integer,Integer> maps =new HashMap<Integer,Integer>();
        for(int num:nums){
            if(!maps.containsKey(num)){
                maps.put(num,1);
            }
            else{
                maps.put(num,maps.get(num)+1);
            }
            if(maps.get(num)>(nums.length)/3){
                if(!element.contains(num)){
                    element.add(num);
                }
            }
        }
        return element;
    }
}