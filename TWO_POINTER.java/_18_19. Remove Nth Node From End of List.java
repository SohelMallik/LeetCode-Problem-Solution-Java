
// 19. Remove Nth Node From End of List

// Example 1:


// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]
// Example 2:

// Input: head = [1], n = 1
// Output: []
// Example 3:

// Input: head = [1,2], n = 1
// Output: [1]
 

// Constraints:

// The number of nodes in the list is sz.
// 1 <= sz <= 30
// 0 <= Node.val <= 100
// 1 <= n <= sz
 



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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

      // Step 1: Move fast n + 1 steps
        for (int i = 0; i <= n; i++){
            fast = fast.next;
        }

        // Step 2: Move both pointers
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        // Step 3: Remove the target node
        slow.next = slow.next.next;
      
        // Step 4: Return updated head
        return dummy.next;





        // ListNode dummy = new ListNode(0);
        // dummy.next = head;

        // int len = 0;
        // ListNode l= head;
       
        // while( l != null){
        //     len++;
        //     l = l.next;
        // }

        // int d = len - n;

        // ListNode curr = head;
        // ListNode pre = dummy;
        // int i = 0;
        // while(i < d){
        //     curr = curr.next;
        //     pre = pre.next;
        //     i++;
        // }

        // pre.next = curr.next;

        // return dummy.next;
    }
}