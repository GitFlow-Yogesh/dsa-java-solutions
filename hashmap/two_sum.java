//do it using loop first = i wont give code 
//thn optimize the solution little more with hashmap
 public static int[] twoSum(int[] arr, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            int complimant = target-arr[i];
            if(map.containsKey(complimant)){
                return new int[]{map.get(complimant),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
