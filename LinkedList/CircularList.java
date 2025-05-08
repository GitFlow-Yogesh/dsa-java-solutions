//node
class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data=data;
    }
}
//linked list
class LinkedList<T>{
    Node<T> Tail;
    int size;
    //constructor
    LinkedList(){
        Tail=null;
        size=0;
    }
    //function for cirular list
    //append function 
    public void append(T value){
        Node<T> newNode = new Node<>(value);
        if(Tail==null){
            Tail=newNode;
            Tail.next=Tail;
        }else{
            newNode.next=Tail.next;
            Tail.next=newNode;
            Tail=newNode;
        }
        size++;
    }
    //display function
    public void display(){
        if(Tail==null){
            System.out.println("list is empty");
            return;
        }else{
            Node current = Tail.next;
            do{
                System.out.print(current.data+" -> ");
                current=current.next;
            }while(current != Tail.next);
        }
        System.out.println("Back to Head");
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("Jai Bajrang Bali");
        LinkedList<Object> ll = new LinkedList<>();
        ll.append(33);
        ll.append(99);
        ll.append(44);
        ll.display();
        System.out.println(ll.size);
    }
}
