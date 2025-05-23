//for happy number using slow fast approach 
public static boolean checknum(int n){
        int slow = n;
        int fast=n;
        do{
            slow=findsquare(slow);
            fast=findsquare(findsquare(fast));
        }while(slow != fast);
        if(slow==1){
            return true ;
        }
        return false;
  }
//this is helper function to find sum of squares example = 19 = > 1^2+9^2=82;
public static int findsquare(int n){
        int ans=0;
        while(n>0){
            int rem = n%10;
            ans += rem*rem ;
            n=n/10;
        }
        return ans;
    }
