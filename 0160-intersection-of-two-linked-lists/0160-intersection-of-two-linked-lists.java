/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a=0;
        int b=0;
        ListNode acur=headA;
        ListNode bcur=headB;
        while(acur!=null){
            a++;
            acur=acur.next;
        }
        while(bcur!=null){
            b++;
            bcur=bcur.next;
        }int fakesteps=0;
        acur=headA;
        bcur=headB;
        if(a>b) {
            int steps=a-b;
            while(steps>0){
                acur=acur.next;
                steps--;
            }
        }else{
            int steps=b-a;
            while(steps>0){
                bcur=bcur.next;
                steps--;
            }
        }
        while(acur!=null||bcur!=null){
            if(acur==bcur){
                return acur;
            }
            acur=acur.next;
            bcur=bcur.next;
        }return null;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna