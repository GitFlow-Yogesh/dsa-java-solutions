//just put first string inside map and remove second one char and check if its empty or not 
        String word = "listen";
        String word2 = "silent";
        Map<Character,Integer> maps= new HashMap<>();
        for(int i =0;i<word.length();i++){
            char ch = word.charAt(i);
            maps.put(ch,maps.getOrDefault(ch,0)+1);
        }
        //removing one by one 
        for(int i =0;i<word2.length();i++){
            char ch = word2.charAt(i);
            if(!maps.containsKey(ch)){
                System.out.println("not found");
                break;
            }
            int freq = maps.get(ch);
            if(freq==1){
                maps.remove(ch);
            }else{
                maps.put(ch, freq - 1);
            }
        }
//agar map empty h to true verna false
