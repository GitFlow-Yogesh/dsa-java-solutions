//its very easy make sure u know when to use helper function
public static int rec(int x){
        return helper(x,0);
    }
    public static int helper(int x, int sum){
        if(x==0)return sum;
        int rem = x%10;
        sum+=rem;
        return helper(x/10,sum);
    }
