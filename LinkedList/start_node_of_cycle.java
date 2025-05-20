public Node detectCycle(Node head) {
    Node slow = head, fast = head;

    // Step 1: Check if a cycle exists
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) break;
    }

    // No cycle
    if (fast == null || fast.next == null) return null;

    // Step 2: Move one pointer to head
    slow = head;

    while (slow != fast) {
        slow = slow.next;
        fast = fast.next;
    }

    return slow; // start of the cycle
}
