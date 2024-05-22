/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer>result;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        result = new ArrayList<>();
        targetK(root,target,k);
        return result;
    }
    public int targetK(TreeNode root,TreeNode target,int k){
        if(root==null) return -1;
        if(root==target){
          ktn(root,k);
            return 0;
        } 
        int left =targetK(root.left,target,k);
        if(left!=-1){
            if(left+1==k){
                result.add(root.val);
            }
            else{
                ktn(root.right,k-left-2);
            }
            return left+1;
        }
        int right =targetK(root.right,target,k);
        if(right!=-1){
            if(right+1==k){
                result.add(root.val);
            }
            else{
                ktn(root.left,k-right-2);
            }
            return right+1;
        }
        return -1;
    }
        public void ktn(TreeNode root,int k){
            if(root==null||k<0)return;
            if(k==0){
                result.add(root.val);
                return;
            }
            ktn(root.left,k-1);
            ktn(root.right,k-1);
        }
}