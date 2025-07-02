//very very easy just one line change just one =whole concept is same =use simple logic u will solve it in one sec
public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> que= new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            int lsize = que.size();
            for(int i =0;i<lsize;i++){
                TreeNode current = que.poll();
                // level.add(current.val);==just this line change fron bst_travel else all concept is same;
                if(i==lsize-1){
                    result.add(current.val);
                }
                if(current.left!=null){
                    que.offer(current.left);
                }
                if(current.right!=null){
                    que.offer(current.right);
                }
            }
        }
        return result;
    }
