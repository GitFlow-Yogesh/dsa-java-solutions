//very simple just check if u have put the char in new string or not if not thn put elsse move to next step , Time O(N^2)

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

///now lets use hashset to add only unique element which will reducce time complexity by O(N)
String str = "heelloll";
Set<Character> set = new HashSet<>();
String newstr = "";

for (char c : str.toCharArray()) {
    if (!set.contains(c)) {
        set.add(c);     // remember we saw it
        newstr += c;    // put it in the result in correct order
    }
}
System.out.println(newstr); // helo
