//very easy bro just again make sure u know how to check substr and thn string 1 = str+str thn check if str 2 is sub string of 1 thats it 
    public static boolean checking(String a, String b){
        if(a.length()!=b.length())return false;
        String a1 = a+a;
        return checksub(a1,b);
    }
    public static boolean checksub(String a,String b){
        // boolean result = false;
        for(int i=0;i<a.length()-b.length();i++){
            int j;
            for( j=0;j<b.length();j++){
                if(a.charAt(i+j)!=b.charAt(j)){
                    // return false;
                    break;
                }
            }
            if(j==b.length())return true;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println("Jai Shree Ram");
        String a = "hello";
        String b= "elloh";
        boolean istrue=checking(a,b);
        System.out.println(istrue);
    }
}
