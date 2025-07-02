//just one line change thats it =hint use max variable with Interger.MIN_VALUE;
List<Integer> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> que= new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            int lsize = que.size();
            int max= Integer.MIN_VALUE;
            for(int i =0;i<lsize;i++){
                TreeNode current = que.poll();
                max=Math.max(max,current.val);
                if(current.left!=null){
                    que.offer(current.left);
                }
                if(current.right!=null){
                    que.offer(current.right);
                }
            }
            result.add(max);
        }
        return result;
    }
