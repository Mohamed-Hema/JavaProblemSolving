package LeetCode.Easy;


public class ReverseLinkedList {
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode nextNode;

            while (head != null) {
                nextNode = head.next;
                head.next = prev;
                prev = head;
                head = nextNode;
            }

            return prev;
        }

        private class ListNode {
            public ListNode next;
        }
    }
}
