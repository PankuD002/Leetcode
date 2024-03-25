class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int k=matrix.length;
        int n=matrix[0].length;
        int l=0;
        int h=k*n-1;
         while(l<=h){
            int mid=(l+h)/2;
            int an=mid/n;int bn=mid%n;
            if(matrix[an][bn]==target){
                return true;
            }
            else if(matrix[an][bn]<target){
                l=mid+1;
                    }
            else if(matrix[an][bn]>target){
                h=mid-1;
            }
        }
        return false;
    }
}