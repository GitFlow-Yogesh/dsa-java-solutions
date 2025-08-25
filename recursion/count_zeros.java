//make sure u try to use helper function it will help to solve in good way 
public static int rec(int x){
    if(x==0){
        return 1;
    }
    return helper(x,0);
}
public static int helper(int x , int count){
    if(x==0)return count;
    int rem = x %10;
    if(rem ==0){
        count++;
    }
    return helper(x/10,count);
    
}
