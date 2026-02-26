// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         if(head==null||head.next==null) return head;
//         ListNode priv=null;
//         ListNode curr=head;
//         ListNode nex=null;//next ko head or null khi pr bhi rkha sakte h
//         while(curr!=null){
//             nex=curr.next;
//             curr.next=priv;
//             priv=curr;
//             curr=nex;
//         }
//         return priv;
//     }
//     public boolean isPalindrome(ListNode head) {
//         if(head.next==null) return true;
//         //create a deep copy 
//         ListNode newHead =new ListNode(head.val);
//         ListNode t1 = head.next;
//         ListNode t2=newHead;
//     while(t1!=null){
//         ListNode temp = new ListNode(t1.val);
//         t2.next=temp;
//         t2=t2.next;
//         t1=t1.next;

//     }
//     //deep copy ko reverse kiya
//     newHead=reverseList(newHead);
//     t1=head;
//     t2=newHead;
//     while(t1!=null){
//         if(t1.val!=t2.val) return false;
//         t2=t2.next;
//         t1=t1.next;
//     }
//     return true;
//     }
// }


//2nd Method

class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Step 1: Find the middle node using slow-fast pointer
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half of the list
        ListNode secondHalf = reverseList(slow);
        ListNode firstHalf = head;

        // Step 3: Compare both halves
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    // Helper function to reverse list
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
