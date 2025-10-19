//very easy just one min 
  public static void moveZero(int[] arr){
        int index =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        for(int j=index;j<arr.length;j++){
            arr[index++]=0;
        }
    }
