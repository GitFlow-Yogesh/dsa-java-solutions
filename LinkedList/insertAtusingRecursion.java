//this is applicable for singly linked list
    //add at certain index using recursion
    public void insertAt(int index, int value){
        Head= helper(value,index,Head);
    }
    private Node helper(int value, int index, Node node){
        if(index==0){
            Node temp = new Node(value);
            temp.next = node;
            size++;
            return temp;
        }
        node.next=helper(value,index-1,node.next);
        return node;
    }

