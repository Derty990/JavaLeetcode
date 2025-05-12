package org.example.linkedLists;

import java.util.HashSet;
import java.util.Set;

public class LC160 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int lenA = getListLengt(headA);
        int lenB = getListLengt(headB);

        while(lenA > lenB){
            lenA--;
            headA = headA.next;
        }

        while(lenB > lenA){
            lenB--;
            headB = headB.next;
        }

        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;

       /* if(headA == null) return headA;
        if(headB == null) return headB;

        Set<ListNode> nodeAddress = new HashSet<>();

        while(headA != null){
            nodeAddress.add(headA);
            headA = headA.next;
        }

        ListNode result = null;

        while(headB != null){
            if(nodeAddress.contains(headB)) return headB;

            headB = headB.next;
        }
        return result;*/

    }

    private int getListLengt(ListNode head) {
        int len = 0;

        while(head!=null){
            len++;
            head = head.next;
        }
        return len;
    }

}
