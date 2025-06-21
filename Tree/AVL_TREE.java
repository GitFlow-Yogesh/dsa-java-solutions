class AVLNode {
    int data, height;
    AVLNode left, right;

    AVLNode(int value) {
        data = value;
        height = 1;
    }
}

class AVLTree {
    AVLNode root;

    // Get height of a node
    int height(AVLNode node) {
        return node == null ? 0 : node.height;
    }

    // Get balance factor
    int getBalance(AVLNode node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    // Right rotate
    AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x; // New root
    }

    // Left rotate
    AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y; // New root
    }

    // Insert node and balance the tree
    AVLNode insert(AVLNode node, int key) {
        // Step 1: Normal BST insert
        if (node == null) return new AVLNode(key);

        if (key < node.data)
            node.left = insert(node.left, key);
        else if (key > node.data)
            node.right = insert(node.right, key);
        else
            return node; // No duplicates

        // Step 2: Update height
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Step 3: Balance the node
        int balance = getBalance(node);

        // 4 cases

        // Left Left
        if (balance > 1 && key < node.left.data)
            return rightRotate(node);

        // Right Right
        if (balance < -1 && key > node.right.data)
            return leftRotate(node);

        // Left Right
        if (balance > 1 && key > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left
        if (balance < -1 && key < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    void inorder(AVLNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
}
