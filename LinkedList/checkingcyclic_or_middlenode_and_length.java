//3 things = find cycle , find middle, find length of cycle =very basic thing 
//very simple = it is called fast slow pointer technique 
//used for = dectection cycle ,middle node =only using one traverse
public boolean hasCycle(Node head) {
        Node slow = head;  //move one step
        Node fast = head;  //move two step at a time 
        while(fast != null && fast.next != null){
            slow = slow.next; // one move 
            fast=fast.next.next;   //moving twice 
            if(slow == fast){  //checking if they meeting means cyclic 
                return true;
            }
        }
        return false;   
}

//checking middle node using slow and fast pointer technique only 
public Node findMiddle(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    return slow; // slow will be at the middle
}

//lets find out length of cycle 
public int findlengthofcylce(Node head) {
        Node slow = head;  
        Node fast = head;  
        while(fast != null && fast.next != null){
            slow = slow.next;  
            fast=fast.next.next; 
            if(slow == fast){  //from here we will start counting
                Node temp = slow;
                int count =0;
                temp = temp.next //or u can use do while loop same thing 
                while(temp != fast){//u can compare with slow also same thing 
                        temp = temp.next;
                        count++;
            }
           return count;
        }
        return 0;   
}
