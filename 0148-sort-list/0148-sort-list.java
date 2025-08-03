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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1); // kuch bhi value chalegi
        ListNode temp = dummy;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        
        while(temp1 != null && temp2 != null){
            if(temp1.val <= temp2.val){
                temp.next = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        
        if(temp1 == null){
            temp.next = temp2;
        } else {
            temp.next = temp1;
        }
        return dummy.next;
    }
// is question ka code sirf yha se hi start hai upar jo hai wo sirf merge karna hai
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode firstHalf = head;
        ListNode slow = head;
        ListNode fast = head;
        
        // Find mid using slow-fast
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode secondHalf = slow.next;
        slow.next = null; // break the list into two halves

        firstHalf = sortList(firstHalf); // sort first half
        secondHalf = sortList(secondHalf); // sort second half

        ListNode ans = mergeTwoLists(firstHalf, secondHalf); // merge two sorted halves
        return ans;
    }
}


//3rd and efficient method
// class Solution {
//     public ListNode sortList(ListNode head) {
//         ListNode temp = head;
//         int len = 0;
//         while (temp != null) {
//             temp = temp.next;
//             len++;
//         }
//         temp = head;
//         int arr[] = new int[len];
//         for (int i = 0; i < len; i++) {
//             arr[i] = temp.val;
//             temp = temp.next;
//         }
//         Arrays.sort(arr);
//         ListNode dummy = new ListNode(-1);
//         ListNode temp1 = dummy;
//         for (int i = 0; i < len; i++) {
//             temp1.next = new ListNode(arr[i]);
//             temp1 = temp1.next;
//         }
//         return dummy.next;
//     }
// }



