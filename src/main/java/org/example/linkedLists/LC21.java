package org.example.linkedLists;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Sprawdzamy przypadki graniczne
        // Jeśli pierwsza lista jest pusta, zwracamy drugą
        if (list1 == null) {
            return list2;
        }

        // Jeśli druga lista jest pusta, zwracamy pierwszą
        if (list2 == null) {
            return list1;
        }

        // Zaczynamy od ustalenia, który węzeł będzie początkiem scalonej listy
        ListNode mergedHead;
        ListNode currentNode;

        // Porównujemy pierwsze węzły obu list
        if (list1.val <= list2.val) {
            // Jeśli pierwszy element list1 jest mniejszy lub równy
            mergedHead = list1;
            list1 = list1.next;  // Przesuwamy list1
        } else {
            // Jeśli pierwszy element list2 jest mniejszy
            mergedHead = list2;
            list2 = list2.next;  // Przesuwamy list2
        }

        // UstawiamyCurrentNode na początek scalonej listy
        currentNode = mergedHead;

        // Główna pętla scalania
        while (list1 != null && list2 != null) {
            // Debugowanie: wyświetlamy aktualny stan list
            System.out.println("Porównuję: list1 = " + list1.val + ", list2 = " + list2.val);

            // Porównujemy wartości węzłów z obu list
            if (list1.val <= list2.val) {
                // Dodajemy węzeł z list1
                currentNode.next = list1;
                currentNode = list1;  // Przesuwamy wskaźnik scalonej listy
                list1 = list1.next;   // Przesuwamy list1
            } else {
                // Dodajemy węzeł z list2
                currentNode.next = list2;
                currentNode = list2;  // Przesuwamy wskaźnik scalonej listy
                list2 = list2.next;   // Przesuwamy list2
            }

            // Opcjonalne: wyświetlanie postępu
            System.out.println("Aktualny stan scalonej listy");
            printList(mergedHead);
        }

        // Dołączamy pozostałości z list
        if (list1 != null) {
            System.out.println("Dołączam pozostałości z list1");
            currentNode.next = list1;
        }

        if (list2 != null) {
            System.out.println("Dołączam pozostałości z list2");
            currentNode.next = list2;
        }

        return mergedHead;
    }

    // Metoda pomocnicza do wyświetlania listy
    private void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Metoda do testowania
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Tworzenie pierwszej listy: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // Tworzenie drugiej listy: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        // Dodajemy wydruki debugujące
        System.out.println("Pierwsza lista:");
        solution.printList(list1);

        System.out.println("\nDruga lista:");
        solution.printList(list2);

        System.out.println("\nScalanie list:");
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        System.out.println("\nScalona lista:");
        solution.printList(mergedList);
    }
}

// Definicja klasy ListNode
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}