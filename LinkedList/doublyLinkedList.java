//double linked list 
//node

class Node<T>{
    T data;
    Node<T> next;
    Node<T> prev;
    Node(T data){
        this.data= data;
        this.next=null;
    }
}
//linked list class
class LinkedList<T>{
    Node<T> Head;
    Node<T> Tail;
    int size;
    LinkedList(){
        Head=null;
        Tail=null;
        size=0;
    }
    //fucntion like append
    public void append(T value){
        Node<T> newNode = new Node<>(value);
        if(Head==null){
            Head=newNode;
            Tail=newNode;
        }else{
            newNode.prev= Tail;
            Tail.next = newNode;
            Tail = newNode;
        }
        size++;
    }
    //display function 
    public void displayforward(){
        Node<T> current = Head;
        while(current != null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.println("null");
    }
    //display reverse
    public void displayreverse(){
        Node<T> current = Tail;
        while(current != null){
            System.out.print(current.data+" -> ");
            current=current.prev;
        }
        System.out.println("null");
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("Jai Bajrang Bali");
        LinkedList<Object> ll = new LinkedList<>();
        ll.append(33);
        ll.append(44);
        ll.append("yogesh");
        ll.displayforward();
        ll.displayreverse();
    }
}
