package org.example.linkedLists;

public class LC876 {
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

    public ListNode middleNode(ListNode head) {

        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while(fastPtr != null && fastPtr.next!=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;

      /*  int listLen = getLen(head);
        int stepsToMiddle = listLen/2;

        ListNode currentNode = head;

        int stepsTaken = 0;

        while(stepsTaken < stepsToMiddle){
            if(currentNode!=null){
                currentNode = currentNode.next;
            }else{
                return null;
            }
            stepsTaken++;
        }
        return currentNode;*/

    }

   /* private int getLen(ListNode head) {

        int len = 0;

        while(head!=null){
            len++;
            head = head.next;
        }
        return len;
    }*/

}
