#3 things to remember =base statement and call again and return thats it 
  public static int fibonacci(int x){
    if(x==0)return 0;
    if(x==1)return 1;
    return fibonacci(x-1)+fibonacci(x-2);
}

//now lets do it using loop =again very simple
public static int fibonacci(int n){
  if(n==0)return 0;
  if(n==1)return 1;
  int a =0,int b=1,int c=0;//now do ur sum is = a+b; instead of c =0;
  for(int i=2;i<=n;i++){
    c=a+b;    // just create one more variable next =a+b;
    a=b;
    b=c;  //here b=next; thats it 
  }
return c;
}
