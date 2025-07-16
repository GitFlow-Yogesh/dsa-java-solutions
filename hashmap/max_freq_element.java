int[] arr = {1, 2, 2, 2, 1, 4, 2};
        Map<Integer,Integer> maps= new HashMap<>();
        for(int num : arr){
            maps.put(num,maps.getOrDefault(num,0)+1);
        }
        int max = 0;
        int element=0 ;
        for(int key : maps.keySet()){
            int current = maps.get(key);
            if(current>max){
                max=current ;
                element = key;
            }
        }
        System.out.println(max);
        System.out.println(element);
