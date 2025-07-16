//nothing can be simpler than this 
      int[] arr = {4, 5, 4, 2, 2, 3, 5, 1};
        Set<Integer> maps= new LinkedHashSet<>();
        for(int num : arr){
            maps.add(num);
        }
        for(int x : maps){
            System.out.print(x+" ");
        }
