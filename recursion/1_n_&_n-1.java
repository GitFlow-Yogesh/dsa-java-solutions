//bro its ntg 
//1-n
public static int rec(int n){
        if(n==0)return -1;
        rec(n-1);
        System.out.println(n);
        return 0;
}
//n-1
public static int rec(int n){
        if(n==0)return -1;
        System.out.println(n);
        return rec(n-1);
}
