//just one line change = instead of result.add(level)= do this = result.addFirst(level)=thats it =very simple bro
public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
            result.addFirst(level);
        }
        return result;
    }
