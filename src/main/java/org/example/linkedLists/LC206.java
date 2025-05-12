package org.example.linkedLists;

public class LC206 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode reverseList(ListNode head) {

        if(head == null){
            return null;
        }

        if( head.next == null){
            return head;
        }


        ListNode preNode = null;
        ListNode currNode = head;

        while(currNode != null){
            ListNode nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }

        head = preNode;
        return head;

      /*  if (head == null || head.next == null) {
            return head;
        }

        ListNode previous = null;

        //1 -> 2 -> 3 -> 4 -> 5
        ListNode current = head;

        while (current != null){
            ListNode nextTemp = current.next;

            current.next = previous;

            previous = current;
            current = nextTemp;
        }
        return previous;*/
    }
}
