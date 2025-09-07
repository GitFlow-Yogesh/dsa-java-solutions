//ntg can be easier than this 
String a = "hellogg is new line";
        String[] str = a.split(" ");
        int max =0;
        String longest = "";
        for(String x : str){
            int current = x.length();
            if(current>max){
                max=current;
                longest += x;
            }
        }
        System.out.println(max);
        System.out.println(longest);
