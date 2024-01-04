class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }


public static ListNode removeNthNode(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode fast = dummy;
    // System.out.println(dummy.next.val);
    ListNode slow = dummy;

    // Move the fast pointer n+1 steps ahead.
    for (int i = 0; i < n; i++) {
        fast = fast.next;
        // System.out.println(fast.val);
    }

    // Move both pointers until the fast pointer reaches the end of the list.
    while (fast != null) {
        fast = fast.next.next;
        // System.out.println(fast.val);
        slow = slow.next;
        
        // System.out.println(fast.val);
    }

    // Remove the nth node by updating the next pointer of the (n-1)th node.
    // System.out.println(slow.val+" "+slow.next.val);
     slow.next = slow.next.next;

    return dummy.next;
}

// Example usage:
public static void main(String[] args) {
    // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    int n = 3; // Remove the 2nd node (counting from 1)
    ListNode newHead = removeNthNode(head, n);

    // Print the updated linked list
    ListNode current = newHead;
    while (current != null) {
        System.out.print(current.val + " -> ");
        current = current.next;
    }
}
}