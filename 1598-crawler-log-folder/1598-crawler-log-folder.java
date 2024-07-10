class Solution {
    public int minOperations(String[] logs) {
        int count=0;
        for(String log:logs){
            if(log.equals("../")){
                count=Math.max(count-1,0);
            }
            else if(!log.equals("./")){
                count++;
            }
        }
        return count;
    }
}