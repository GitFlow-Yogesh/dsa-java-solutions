//like for sum=two things base statement and call again thats it what can be more simpler than this 
public static int sum(int x){
  if(x==1)return 1;    
  return x+sum(x-1);
}
