//just basic knowledge and one line changement
List<Double> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> que= new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            int lsize = que.size();
            double elements = 0;
            for(int i =0;i<lsize;i++){
                TreeNode current = que.poll();
                elements += current.val;
                if(current.left!=null){
                    que.offer(current.left);
                }
                if(current.right!=null){
                    que.offer(current.right);
                }
            }
            result.add(elements/lsize);
        }
        return result;
    }
