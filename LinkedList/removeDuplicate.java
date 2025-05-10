//class node
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
//linked list
class LinkedList{
    Node Head;
    Node Tail;
    int size;
    //constructor
    LinkedList(){
        Head=null;
        Tail=null;
        size=0;
    }
    //function to use this
    //append
    public void append(int data){
        Node newNode =new Node(data);
        if(Head==null){
            Head=newNode;
            Tail=newNode;
        }else{
            Tail.next=newNode;
            Tail=newNode;
        }
        size++;
    }
    //display function 
    public void display(){
        Node current = Head;
        while(current!=null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.println("null");
    }
    //insert at using recursion 
    public void insertAt(int index,int value){
        Head = helper(index,value,Head);
    }
    //helper function 
    private Node helper(int index, int value, Node node){
        //base condition 
        if(index==0){
            Node temp = new Node(value);
            temp.next = node;
            size++;
            return temp;
        }
        node.next = helper(index-1,value,node.next);
        return node;
    }
    //remove duplicates
    public void removeduplicate(){
        Node current = Head;
        while(current != null && current.next!=null){
            if(current.data == current.next.data){
                    //remove node 
                    current.next=current.next.next;
                    size--;
                    //handle tail
                    if(current.next == null){
                       Tail = current;
                    }
            }else{
            current =current.next;
            }
        }
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("Jai Bajrang Bali");
        LinkedList ll = new LinkedList();
        ll.append(22);
        ll.append(55);
        ll.append(44);
        ll.append(44);
        ll.append(44);
        ll.append(44);
        ll.append(88);
        ll.append(88);
        ll.insertAt(2,99);
        ll.removeduplicate();
        ll.display();
        System.out.println("Size of list is "+ll.size);
    }
}
