//merge two sorted list
    public LinkedList merge(LinkedList list1,LinkedList list2){
        LinkedList finallist= new LinkedList();
        Node head1=list1.Head;
        Node head2=list2.Head;
        while(head1 != null && head2 != null){
            if(head1.data<head2.data){
                finallist.append(head1.data);
                head1=head1.next;
            }else{
                finallist.append(head2.data);
                head2=head2.next;
            }
        }
        //checking if one has more element
        while(head1 != null){
            finallist.append(head1.data);
            head1=head1.next;
        }
        //for second list if it has more element
        while(head2 != null){
            finallist.append(head2.data);
            head2=head2.next;
        }
        
        return finallist;
    }
    //use tostring method to print real data instead of hexa value and all override this
    //note = use Stringbuilder class to avoid garbage collection and thats easy also seee downbelow 
    @Override
    public String toString() {
    Node current = Head;
    String result = "";
    while (current != null) {
        result += current.data + " -> ";
        current = current.next;
    }
    return result + "null";
    }
    //using stringbuilder method and its append -> stringbuilder is an object not string , so while return use toString method
  @Override
    public String toString(){
        Node current =Head;
        StringBuilder str = new StringBuilder();
        while(current!=null){
            str.append(current.data).append(" -> ");
            current=current.next;
        }
        return str.append("null").toString();
    }
