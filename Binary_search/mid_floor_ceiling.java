// this has three solution - first find target using bs - second find ceiling of an array - third find floor of a number 
  public static int bs(int[] arr,int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;     //use this for find target if not found return -1
        return arr[start];  //use this for find ceiling of an array means just next greater thn target if target not found 
        return arr[end];    //use this for find floor of an array means find just smaller than target if target not found 
    }
