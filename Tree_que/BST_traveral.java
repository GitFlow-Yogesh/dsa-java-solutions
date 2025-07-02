//bst traversal 
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> que= new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            int lsize = que.size();
            List<Integer> level= new ArrayList<>();
            for(int i =0;i<lsize;i++){
                TreeNode current = que.poll();
                level.add(current.val);
                if(current.left!=null){
                    que.offer(current.left);
                }
                if(current.right!=null){
                    que.offer(current.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}
