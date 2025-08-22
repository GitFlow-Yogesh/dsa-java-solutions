//node create = where u use int use generic class ex Y and wherever u use Node use Node<Y> thats it itna simple h
class Node<Y>{
    Y data;
    Node<Y> next;
    Node(Y data){
        this.data=data;
        this.next=null;
    }
}
//linked list create 
class LinkedList<Y>{
    Node<Y> Head;
    Node<Y> Tail;
    int size;
    LinkedList(){
        Head=null;
        Tail=null;
        size=0;
    }
    //append
    public void append(Y data){
        Node<Y> newNode =new Node<>(data);
        if(Head==null){
            Head=newNode;
            Tail = newNode;
        }else{
            Tail.next= newNode;
            Tail=newNode;
        }
        size++;
    }
    //display function 
    public void display(){
        Node<Y> current = Head;
        while(current != null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.println("null");
    }
    //remove function 
    // public void remove(int value){
    //     Node current = Head;
    //     while(current.data == value)
    // }
}
class Main {
    public static void main(String[] args) {
        System.out.println("jai Bajrang Bali");
        //linked list - singular list
        LinkedList list = new LinkedList();
        LinkedList<Object> ll = new LinkedList<>(); // use this one to ignore warning 
        list.append("Yogesh");
        list.append("Yadav");
        list.append(21);
        list.append('a');
        list.append(true);
        list.append(2.43f);
        list.append(33.222d);
        list.display();
        System.out.println(list.size);
    }
}
