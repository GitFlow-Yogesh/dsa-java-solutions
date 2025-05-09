//node 
class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data=data;
        this.next=null;
    }
}
//linkedlist
class LinkedList<T>{
    Node<T> Head;
    Node<T> Tail;
    int size;
    //construtor
    LinkedList(){
        Head=null;
        Tail=null;
        size=0;
    }
    //append function 
    public void append(T value){
        Node<T> newNode =new Node<>(value);
        if(Head==null){
            Head=newNode;
            Tail=newNode;
        }else{
            Tail.next = newNode;
            Tail=newNode;
            
        }
        size++;
    }
    //display function 
    public void display(){
        Node<T> current = Head;
        while(current != null){
            System.out.print(current.data+ " -> ");
            current=current.next;
        }
        System.out.println("null");
    }
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
class Main {
    public static void main(String[] args) {
        System.out.println("Jai Bajrang Bali");
        LinkedList<Object> ll = new LinkedList<>();
        ll.append(33);
        ll.append(45);
        ll.append(23);
        ll.append("preetam");
        ll.append("yadav");
        ll.insertAt(2,7);
        ll.display();
        System.out.println("Size of linked list is :  "+ll.size);
    }
}
