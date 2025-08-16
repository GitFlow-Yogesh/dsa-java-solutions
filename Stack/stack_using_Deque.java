
class StackUsingDeque {
    private Deque<Integer> deque;

    public StackUsingDeque() {
        deque = new ArrayDeque<>();
    }

    // Push element onto stack
    public void push(int x) {
        deque.addFirst(x);  // add at front (top of stack)
    }

    // Pop element from stack
    public int pop() {
        if (deque.isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        return deque.removeFirst(); // remove from front (top of stack)
    }

    // Peek top element
    public int peek() {
        if (deque.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return deque.peekFirst();
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    // Get size of stack
    public int size() {
        return deque.size();
    }
}
