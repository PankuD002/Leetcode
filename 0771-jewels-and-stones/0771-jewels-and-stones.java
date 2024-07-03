class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int jewels_size=jewels.length();
        int stones_size=stones.length();
        int count=0;
        for(int i=0;i<jewels_size;i++){
            for(int j=0;j<stones_size;j++){
                if(jewels.charAt(i)==stones.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
}