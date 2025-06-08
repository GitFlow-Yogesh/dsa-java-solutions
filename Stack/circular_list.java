//only few changes than linear==why to chose this = bcz it helps to use front space when dequeue 
//no 1 ===> rear = (rear+1)%capacity;
//no 2 ===> front= (front+1)%capacity;
//while checking full example===> if((rear+1)%capacity==front)==> its means its full 
//last change in display function == > index = (front+i)%capacity;  thn print queue[index]
//thats it simple 

class Queue{
    private int[] queue;
    private int size;
    private int capacity;
    private int front;
    private int rear;
    Queue(int capacity){
        this.capacity=capacity;
        queue = new int[capacity];
        size=0;
        front = 0;
        rear=-1;
    }
    //functions to manipulate
    //check if queue is full 
    public boolean ifFull(){
        return (rear+1)%capacity==front;
    }
    //add data;
    public void enqueue(int data){
        if(size==capacity){
           System.out.println("its full");
          return ;
        }else{
            rear = (rear+1)%capacity;
            queue[rear]=data;
            size++;
        }
    }
    //dequeue
    public void dequeue(){
        if(size==0){
            System.out.println("its empty");
        }else{
            front = (front+1)%capacity;
            size--;
        }
    }
    //display
    public void display(){
        if(size==0){
            System.out.println("no element found");
            return;
        }else{
            for(int i=0;i<size;i++){
                int index = (front+i)%capacity;
                System.out.print(queue[index]+" ");
            }
            System.out.println();
        }
    }
}
