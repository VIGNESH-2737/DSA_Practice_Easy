import java.util.PriorityQueue;

public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode node : lists) {
            if (node != null) {
                minHeap.add(node);
            }
        }

        ListNode dummy = new ListNode(-1); 
        ListNode current = dummy;

        while (!minHeap.isEmpty()) {
            ListNode smallest = minHeap.poll();
            current.next = smallest;
            current = current.next;

            // Move to the next node in the list
            if (smallest.next != null) {
                minHeap.add(smallest.next);
            }
        }

        return dummy.next;
    }

    // Helper function to create a linked list from an array
    public static ListNode createList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for (int num : arr) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper function to print a linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MergeKSortedLists solution = new MergeKSortedLists();

        // Example 1
        ListNode[] lists1 = new ListNode[]{
            createList(new int[]{1, 4, 5}),
            createList(new int[]{1, 3, 4}),
            createList(new int[]{2, 6})
        };

        System.out.println("Input Lists:");
        for (ListNode list : lists1) {
            printList(list);
        }

        ListNode merged1 = solution.mergeKLists(lists1);
        System.out.println("\nMerged List:");
        printList(merged1);

        // Example 2 (Empty case)
        ListNode[] lists2 = new ListNode[]{};
        ListNode merged2 = solution.mergeKLists(lists2);
        System.out.println("\nMerged List (Empty Input):");
        printList(merged2); // Should print "null"

        // Example 3 (One list)
        ListNode[] lists3 = new ListNode[]{
            createList(new int[]{1, 2, 3})
        };
        ListNode merged3 = solution.mergeKLists(lists3);
        System.out.println("\nMerged List (Single List):");
        printList(merged3);
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

