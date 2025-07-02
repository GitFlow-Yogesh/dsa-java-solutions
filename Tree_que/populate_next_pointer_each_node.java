//simple =use prev pointer to manage thats it 
class Solution {
    public Node connect(Node root) {
        if (root == null) return null;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            Node prev = null;

            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();

                if (prev != null) {
                    prev.next = curr;
                }
                prev = curr;

                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }
        }

        return root;
    }
}
//without que in o(1) time 
class Solution {
    public Node connect(Node root) {
        if (root == null) return null;

        Node leftmost = root;

        while (leftmost.left != null) {
            Node head = leftmost;

            while (head != null) {
                // Connect left -> right
                head.left.next = head.right;

                // Connect right -> next.left (if exists)
                if (head.next != null) {
                    head.right.next = head.next.left;
                }

                head = head.next;
            }

            leftmost = leftmost.left;
        }

        return root;
    }
}
