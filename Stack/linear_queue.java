//drawback , when we use dequeue - its capacity decrease =solution to shift element by one left else use cirular queue 
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
    //add data;
    public void enqueue(int data){
        if(rear==capacity-1){
           System.out.println("its full");
           return ;
        }else{
            queue[++rear]=data;
            size++;
        }
    }
    //dequeue
    public void dequeue(){
        if(size==0){
            System.out.println("its empty");
        }else{
            front++;
            size--;
        }
    }
    //display
    public void display(){
        if(size==0){
            System.out.println("no element found");
            return;
        }else{
            for(int i=front;i<=rear;i++){
                System.out.print(queue[i]+" ");
            }
            System.out.println();
        }
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("Jai Bajrang Bali");
        Queue que = new Queue(5);
        que.enqueue(4);
        que.enqueue(5);
        que.enqueue(6);
        que.enqueue(7);
        que.enqueue(8);
        que.dequeue();
        que.enqueue(9);
        que.display();
    }
}
