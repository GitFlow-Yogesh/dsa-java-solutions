    //this is applicable for singly linked list
    //append at perticular postion without using recursion 
    public void insertAt(int index, T value){
        Node<T> newNode= new Node<>(value);
        if(index<0){
            System.out.println("invalid index ");
            return ;
        }
        if(index==0){
            newNode.next=Head;
            Head= newNode;
            if(Tail==null){
                Tail=newNode;
            }
            return ;
        }
        //reach till desired index by less than 1
        Node<T> current = Head;
        int count = 0;
        while(current != null && count < index-1){
            current = current.next;
            count++;
        }
        //if current index out of bound 
        if(current == null){
            System.out.println("out of bound ");
            return ;
        }
        //now i have to insert a node using current
        newNode.next = current.next;
        current.next=newNode;
        //suppose u r inserting at the end update tail
        if(newNode.next==null){
            Tail=newNode;
        }
        size++;
    }
}
