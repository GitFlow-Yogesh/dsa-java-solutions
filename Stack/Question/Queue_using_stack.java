//very very easy = two steps =leetcode =232 
//step1= add direct to stack1
//step2= while peek or pop , first shift element into 2 thn response.


class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    // Constructor
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Push element to the back of queue
    public void push(int x) {
        stack1.push(x);
    }

    // Removes and returns the front element
    public int pop() {
        shiftStacks();
        return stack2.pop();
    }

    // Get the front element
    public int peek() {
        shiftStacks();
        return stack2.peek();
    }

    // Returns true if queue is empty
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Helper method: shift elements from stack1 to stack2 if stack2 is empty
    private void shiftStacks() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }
}
