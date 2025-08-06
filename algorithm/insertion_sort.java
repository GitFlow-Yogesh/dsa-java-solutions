// //insertion sort = it maintain sorted part and unsorted part and while shifting j it creates a duplicate of the number where we r going to put our i 
// and later on we put our i at right place =very simple 
      int[] arr = {3,2,5,1,6,8};
        for(int i =1;i<arr.length;i++){
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        System.out.println(Arrays.toString(arr));
