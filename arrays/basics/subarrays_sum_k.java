//very easy just one min thinking normally 
    public int subarraySum(int[] nums, int k) {
        int count =0;
        int sum =0;
        Map<Integer,Integer> maps = new HashMap<>();
        maps.put(0,1);
        for(int x : nums){
            sum+=x;
            if(maps.containsKey(sum-k)){
                count += maps.get(sum-k);
            }
            maps.put(sum,maps.getOrDefault(sum,0)+1);
        }
        return count ;
    }
