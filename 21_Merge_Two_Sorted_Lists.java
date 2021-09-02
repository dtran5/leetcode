class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // dummy is put in place to help us build our list
        ListNode dummy = new ListNode(0);
        // reference to head so we can return our list at the end
        ListNode head = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                dummy.next = l1;
                l1 = l1.next;
            } else {
                dummy.next = l2;
                l2 = l2.next;
            }

            dummy = dummy.next;
        }

        if (l1 == null) {
            dummy.next = l2;
        } else {
            dummy.next = l1;
        }

        // removes our dummy node and returns the actual list
        return head.next;
    }
}