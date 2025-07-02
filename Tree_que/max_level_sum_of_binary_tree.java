//four things to track = maxsum , maxlevel, currentlevel,levelsum;
    public int maxLevelSum(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);

        int maxSum = Integer.MIN_VALUE;
        int maxLevel = 1;
        int currentLevel = 1;

        while (!que.isEmpty()) {
            int levelSize = que.size();
            int levelSum = 0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = que.poll();
                levelSum += current.val;

                if (current.left != null) que.offer(current.left);
                if (current.right != null) que.offer(current.right);
            }

            if (levelSum > maxSum) {
                maxSum = levelSum;
                maxLevel = currentLevel;
            }

            currentLevel++;
        }

        return maxLevel;
}   
