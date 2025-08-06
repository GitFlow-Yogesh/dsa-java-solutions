//each iteration will take the smallest element in start thats it our goal to achieve

int[] arr = {3,2,5,1,6,8};
for(int i =0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            //swipe the index with i;
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
 }
System.out.println(Arrays.toString(arr));
  
