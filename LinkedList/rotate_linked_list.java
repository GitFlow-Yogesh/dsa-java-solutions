public void rotate(int k) {
    if (head == null || head.next == null || k == 0)
        return;

    // Count the length
    Node current = head;
    int length = 1;
    while (current.next != null) {
        current = current.next;
        length++;
    }

    // Make it circular
    current.next = head;

    // Find new head and tail
    k = k % length;
    int stepsToNewTail = length - k;
    Node newTail = head;
    for (int i = 1; i < stepsToNewTail; i++) {
        newTail = newTail.next;
    }

    head = newTail.next;
    newTail.next = null;
}
