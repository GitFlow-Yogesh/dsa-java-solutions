//using iteration =try to visulaise it thn it will be solved within second == very easy 
public Node reverseIterative(Node head) {
    Node prev = null;
    Node current = head;

    while (current != null) {
        Node next = current.next; // store next node
        current.next = prev;      // reverse current node's pointer
        prev = current;           // move prev forward
        current = next;           // move current forward
    }

    return prev; // new head= why prev bcz current is at null right now so return prev this is last node only
}



