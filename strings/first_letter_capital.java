//just keep this thing that convert only when i-1==' '     thatsit
      String str = "this is yogesh";
        String newstr="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(i==0 || str.charAt(i-1)==' '){
                char ch2=Character.toUpperCase(ch);
                newstr+=ch2;
            }else{
                newstr+=ch;
            }
        }
        System.out.println(newstr);
