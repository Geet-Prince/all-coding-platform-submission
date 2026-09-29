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
class Solution{
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode a=l1;
        ListNode b=l2;
        ListNode res=new ListNode();
        ListNode curr=res;
        int carry=0;
        while(a!=null||b!=null){
            int x=(a!=null)?a.val:0;
            int y=(b!=null)?b.val:0;
            int sum=x+y+carry;
            int data=sum%10;
            carry=sum/10;
            curr.next=new ListNode(data);
            curr=curr.next;
            if(a!=null)a=a.next;
            if(b!=null)b=b.next;
        }
        if(carry!=0)curr.next=new ListNode(carry);
        return res.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna