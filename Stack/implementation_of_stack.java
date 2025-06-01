class Stack{
    private int[] stack;
    private int top;
    private int capacity;
    public Stack(int size){
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }
    //methods to manipulate 
    public  void push(int data){
        if(top==capacity-1){
            System.out.println("Stack overflow");
            return;
        }
        stack[++top]=data;
    }
    //remove 
    public int pop(){
        if(top==-1){
            System.out.println("stack underflow");
            return -1;
        }
        return stack[top--];
    }
    //peek
    public int peek(){
        if(top==-1){
            System.out.println("stack underflow");
            return -1;
        }
        return stack[top];
    }
    //if empty
    public boolean isEmpty(){
        return top==-1;
    }
    //size
    public int size(){
        return top+1;
    }
    //display stack
    public  void display(){
        if(top==-1){
            System.out.println("stack underflow");
        }
        System.out.print("Stack elements: ");
        for(int i =0;i<=top;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("Jai Bajrang Bali");
        Stack stk = new Stack(4);
        stk.push(4);
        stk.push(5);
        stk.push(6);
        stk.push(7);
        System.out.println(stk.pop());
        System.out.println(stk.peek());
        System.out.println(stk.isEmpty());
        System.out.println(stk.size());
        stk.display();
    }
}
