//steps = first find middle , and reverse second half , thn compare simple 
public boolean isPalindrome() {
        if (head == null || head.next == null) return true;

        // Step 1: Find middle using slow and fast pointers
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half of the list
        Node secondHalf = reverseList(slow);

        // Step 3: Compare both halves
        Node firstHalf = head;
        Node temp = secondHalf; // to remember reversed head for optional restoration
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // Step 4: (Optional) Restore the original list
        reverseList(temp);

        return true;
    }

    // Function to reverse a linked list (standard iterative reverse)
    private Node reverseList(Node head) {
        Node prev = null;
        while (head != null) {
            Node nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }
