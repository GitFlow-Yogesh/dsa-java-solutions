//bro ntg bro waste of time
    public static int rec(int x){
        if(x==0)return 1;
        int rem = x%10;
        System.out.println(rem);
        return rec(x/10);
    }
