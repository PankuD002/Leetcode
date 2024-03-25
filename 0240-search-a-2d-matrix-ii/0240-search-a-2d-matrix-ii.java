class Solution {
    public boolean searchMatrix(int[][] matrix, int target){
        int k=matrix.length-1;
        int n=matrix[0].length-1;
        int i=0;
        int j=n;
        while(i<=k && j>=0){
            if(target==matrix[i][j]){
                return true;
           }
            else if(target<matrix[i][j]){
                        j--;
            }
            else{
                i++;
            }
        }
    return false;
    }
}