class Solution {
    public static long generate(int n,int r){
        long ans=1;
        for(int i=0;i<r;i++){
            ans=ans*(n-i);
            ans=ans /(i+1);
        }
        return ans;
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row=new ArrayList<>();
        for(int col=0;col<=rowIndex;col++){
            row.add((int)generate(rowIndex,col));
        }
        return row;
    }
}