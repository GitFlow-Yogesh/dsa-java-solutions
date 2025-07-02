// /everything is same just use boolean var to manipulate
List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> que= new LinkedList<>();
        que.offer(root);
        boolean leftToRight = true;    //new apart from bst
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
            if (!leftToRight) { //condition apply depend upon true false 
                Collections.reverse(level);
            }
            result.add(level);
            leftToRight = !leftToRight;    //changement at the end 
        }
        return result;
