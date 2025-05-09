// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Node{
    int data;
    Node next;
    //construtor
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
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
    //functions to work with
    //append 
    public void append(int data){
        Node newNode = new Node(data);
        if(Head==null){
            Head=newNode;
            Tail=newNode;
        }
        else{
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
    //check size
    public int size(){
        return size;
    }
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
}
class Main {
    public static void main(String[] args){
        System.out.println("Jai Bajrang Bali");
        LinkedList ll = new LinkedList();
        ll.append(22);
        ll.append(33);
        ll.append(55);
        ll.insertAt(2,88);
        ll.display();
        System.out.println(ll.size());
    }
} 
