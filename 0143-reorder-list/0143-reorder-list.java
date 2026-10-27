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
    public void reorderList(ListNode head) {
        ArrayList<Integer>asd=new ArrayList<>();
        ListNode cur=head;
        int i=0;
        while(cur!=null){
            asd.add(cur.val);

            cur=cur.next;
            i++;
        }
        i--;
        cur=head;
        int j=0;
        while(cur!=null){
            int valpos;
            if (j%2==0) {
                valpos=j/2;
            }else{
                valpos=i-j/2;
            }
            cur.val=asd.get(valpos);
            cur=cur.next;
            j++;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna