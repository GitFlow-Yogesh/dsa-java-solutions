//has three que one min each
//fact and sum  just sign diff 
    public static int fact(int n){
        if(n==1)return 1;
        return n*fact(n-1); //instead of * this use + this for sum
    }

//fabo
public static int fib(int n) {
        if (n == 0) return 0; // base case
        if (n == 1) return 1; // base case
        return fib(n - 1) + fib(n - 2); // recursion
}
