public void removeduplicate(){
        Node current =head;
        while(current != null &&current.next != null){
            if(current.data == current.next.data){
                current.next=current.next.next;
                size--;
            }else{
                current=current.next;
            }
        }
          //updating tail just in case we remove last node which is duplicate
            tail=current ;
            tail.next=null;
    }
