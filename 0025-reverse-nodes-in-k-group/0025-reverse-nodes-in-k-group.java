import java.util.Stack;

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<ListNode> st = new Stack<>();

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode start = head;

        while (head != null) {

            // Push k nodes into stack
            while (head != null && st.size() < k) {
                st.push(head);
                head = head.next;
            }

            // If stack has k nodes, reverse them
            if (st.size() == k) {
                while (!st.isEmpty()) {
                    dummy.next = st.pop();
                    dummy = dummy.next;
                }
                dummy.next = null;
            } 
            else {
                // Less than k nodes left, keep as it is
                dummy.next = start;
            }

            start = head;
        }

        return temp.next;
    }
}