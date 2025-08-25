//ntg very easy just 1 min 
public static boolean sort(int[] arr){
        return helper(arr,0);
    }
    public static boolean helper(int[] arr,int s){
        if(s==arr.length-1)return true;
        if(arr[s]>arr[s+1])return false;
        return helper(arr,s+1);
    }
