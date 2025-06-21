//Traversal = Depth first search(DFS) = Inorder(root mid),PreOrder(root start),PostOrder(root end).
//define node = data,left,right
class Node{
    int data;
    Node left;
    Node right;
    Node(int value){
        data=value;
        left = null;
        right=null;
    }
}
//treee
class Tree{
    Node root;
    Tree(){
        root=null;
    }
  //add data using recursion 
    void insert(int value){
        root = helper(root,value);
    }
  //add helper using recursion
    Node helper(Node root,int value){
        if(root==null){
            root = new Node(value);
            return root;
        }
        if(value<root.data){
            root.left=helper(root.left,value);
        }else{
            root.right=helper(root.right,value);
        }
        return root;
    }
    //set left -> root -> right =InOrder Traversal = print sorted values always.
    void InOrder(Node node){
        if(node==null)return;
        InOrder(node.left);
        System.out.print(node.data+" ");
        InOrder(node.right);
    }
    //set left -> right -> root=Postorder Traversal
    void PostOrder(Node node){
        if(node==null)return;
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.data+" ");
    }
    //set root -> left -> right =Preorder Traversal
    void PreOrder(Node node){
        if(node==null)return;
        System.out.print(node.data+" ");
        PreOrder(node.left);
        PreOrder(node.right);
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Jai Bajrang Bali");
        Tree tr = new Tree();
      
        //if u add like this it will be hard to add == its manually 
        // tr.root=new Node(1);
        // tr.root.left=new Node(2);
        // tr.root.right=new Node(3);
        // tr.root.left.left=new Node(4);
      
        //use recursion to add like this 
        tr.insert(5);
        tr.insert(3);
        tr.insert(6);
        tr.insert(7);
        tr.insert(1);
        tr.insert(4);
        tr.insert(8);
      //will print in sorting order 
        System.out.print("In order : ");
        tr.InOrder(tr.root); 
        System.out.println();
      //will print root node first
        System.out.print("Pre order : ");
        tr.PreOrder(tr.root); 
        System.out.println();
      //will print root node last
        System.out.print("Post order : ");
        tr.PostOrder(tr.root); 
        System.out.println();
        
    }
}
