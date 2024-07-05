/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int min_dis=Integer.MAX_VALUE;
        ListNode prev =head;
        ListNode curr=head.next;
        int index=1;
        int first_critical_point=-1;
        int last_critical_point=-1;
        while(curr!=null && curr.next !=null){
            if((curr.val>prev.val && curr.val>curr.next.val) ||(curr.val<prev.val &&                                            curr.val<curr.next.val)){
                if(first_critical_point==-1){
                    first_critical_point=index;
                }
                else{
                    min_dis=Math.min(min_dis,index-last_critical_point);
                }
                last_critical_point=index;
            }
            prev=curr;
            curr=curr.next;
            index++;
        }
        if(min_dis==Integer.MAX_VALUE){
            return new int[]{-1,-1};
        }
        return new int[]{min_dis,last_critical_point-first_critical_point};
    }
}