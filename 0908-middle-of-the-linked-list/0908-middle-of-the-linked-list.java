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
    public ListNode middleNode(ListNode head) {
        int cnt=0;
        ListNode cur=head;

        while(cur!=null)
        {
            cnt++;
            cur=cur.next;
        }
        System.out.print(cnt);
        ListNode ans=head;

        int t = cnt/2;

        while(t != 0)
        {
            ans=ans.next;
            t--;
        }

        return ans;
    }
}