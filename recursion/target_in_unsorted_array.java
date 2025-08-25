//bro literally ntg time waste 
public static int sort(int[] arr,int target){
        return helper(arr,9,0);
    }
    public static int helper(int[] arr,int target,int s){
        if(s==arr.length-1)return -1;
        if(arr[s]==target)return s;
        return helper(arr,target,s+1);
    }
