public static void add(int[] arr, int element,int index){
        if(index<0 || index >= arr.length)return;
        int[] newarr = new int[arr.length+1];
        int i;
        int j =0;
        for( i=0;i<arr.length;i++){
            if(i<index){
                newarr[j++]=arr[i];
            }
            else if(i==index){ //make sure you handle two elements here 
                newarr[j++]=element;
                newarr[j++]=arr[i];   
            }
            else{
                newarr[j++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
    public static void main(String[] args) {
        System.out.println("Jai Bajrang Bali");
        int[] arr= {1,2,3,4,5,6};
        int n = 7;
        add(arr,n,1);
    }
