//very easy only require five things and use thm = int arr, front , rear, size, capacity  = thats it 
class Queue{
    private int[] queue;
    private int rear;
    private int front;
    private int capacity;
    private int size;
    public Queue(int k){
        capacity=k;
        queue = new int[capacity];
        rear =-1;
        front =0;
        size=0;
    }
    // check if stacck is full or not 
    public boolean isFull(){
        return size==capacity;
    }
    //is Empty
    public boolean isEmpty(){
        return size==0;
    }
    //add element 
    public void push(int data){
        if(isFull()){
            System.out.println("Stack overflow");
            return;
        }
        queue[++rear]=data;
        size++;  
    }
    //pop method 
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        int val= queue[front++];
        size--;
        return val;
    }
    //peek 
    public int peek(){
        if(isEmpty()){
            System.out.println("no element");
            return -1;
        }
        return queue[front];
    }
    //display
    public void display(){
        if(isEmpty()){
            System.out.print("Stack Underflow");
            return ;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
}
