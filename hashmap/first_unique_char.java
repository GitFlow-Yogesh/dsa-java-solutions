//two ways use loop or hashmap 
//use hashmap
        String name = "leetcode";
        Map<Character,Integer> maps=new LinkedHashMap<>();
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            maps.put(ch,maps.getOrDefault(ch,0)+1);
        }
        for(char key : maps.keySet()){
            if(maps.get(key)==1){
                System.out.println(key);
                break;
            }
        }
//use loops 
          String name = "yogesh";
          for(int i =0;i<name.length();i++){
            boolean ok = true ;
            char ch = name.charAt(i);
            for(int j=0;j<name.length();j++){
                if(i!=j && ch == name.charAt(j)){
                    ok=false;
                    break;
                }
            }
            if(ok){
            System.out.println(ch);
            break;
            }
        }
