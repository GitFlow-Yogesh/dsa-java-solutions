//very simple just check if u have put the char in new string or not if not thn put elsse move to next step
      String str = "heelloll";
        String newstr="";
        for(int i=0;i<str.length();i++){
            boolean camepre=false;
            for(int j=0;j<newstr.length();j++){
                if(newstr.charAt(j)==str.charAt(i)){
                    camepre= true;
                    break;
                }
            }
            if(!camepre){
                newstr+=str.charAt(i);
            }
        }
        System.out.print(newstr);
