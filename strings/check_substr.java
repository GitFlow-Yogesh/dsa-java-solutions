//simple h just keep in mind how to keep increasing j in inner loop by (i+j)
      String str = "heelloll";
        String newstr="llo";
        boolean found = false;
        for(int i=0;i<str.length()-newstr.length();i++){
            int j;
            for( j=0;j<newstr.length();j++){
                if(str.charAt(i+j)!=newstr.charAt(j)){
                    break;
                }
            }
            if(j==newstr.length()){
                System.out.println("yes it exist");
                found =true;
                break;
            }
        }
        if(found){
            System.out.println(found);
        }
