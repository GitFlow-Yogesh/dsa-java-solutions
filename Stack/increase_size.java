public void resize(){
        capacity = capacity*2;
        int[] newstack= new int[capacity];
        //copying old element
        for(int i =0;i<=top;i++){
            newstack[i]=stack[i];
        }
        stack = newstack;
    }
