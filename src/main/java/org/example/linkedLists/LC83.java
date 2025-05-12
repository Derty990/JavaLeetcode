package org.example.linkedLists;

public class LC83 {
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

    public ListNode deleteDuplicates(ListNode head) {

        if(head == null) return null;
        if(head.next == null) return head;

        ListNode prev = head;
        ListNode temp = prev.next;
        while(temp!=null){

            if(temp.val == prev.val){
                temp = temp.next;
                continue;
            }

            prev.next = temp;
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return head;
    }

}
