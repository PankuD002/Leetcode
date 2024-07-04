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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> value=new HashSet<>();
        for(int i:nums){
            value.add(i);
        }
        int count=0;
        while(head!=null){
            if(value.contains(head.val) && (head.next==null || !value.contains(head.next.val))){
                count++;
            }
            head=head.next;
        }
        return count;
    }
}