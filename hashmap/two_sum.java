//do it using loop first = i wont give code 
//thn optimize the solution little more with hashmap
public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> maps= new HashMap<>();
        int[] arr= new int[2];
        int index=0;
        for(int i=0;i<nums.length;i++){
            int first_element = target-nums[i];
            if(!maps.containsKey(first_element)){
                maps.put(nums[i],i);
            }else{
                arr[index++]=maps.get(first_element);
                arr[index++]=i;
            }
        }
        return arr;
    }
