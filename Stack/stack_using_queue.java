class MyStack {
    private int[] arr=new int[100];
    private int size;
    private int rear;
    public MyStack() {
        rear=-1;
        size=0;
    }
    public void push(int x) {
        if(size==arr.length){
            System.out.print("its full");
            return;
        }
        arr[++rear]=x;
        size++;
    }
    public int pop() {
        if(empty())return -1;
        int element = arr[rear--];
        size--;
        return element;
    }
    public int top() {
        if(empty())return -1;
        return arr[rear];
    }
    public boolean empty() {
        return rear==-1;
    }
}
