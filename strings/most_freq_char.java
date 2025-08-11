//simple h 
        String str1 = "heelloll";
        String str= str1.toLowerCase();
        int[] arr = new int[26]; // only lowercase letters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') { // safety check
                arr[ch - 'a']++;
            }
        }
        
        int count = 0;
        char mostFreq = '\0';
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > count) {
                count = arr[i];
                mostFreq = (char)(i + 'a');
            }
            //use below condition when they ask for first non repeating char
            //     if(arr[i]==1){
            //     char ch = (char)(i+'a');
            //     System.out.println(ch);
            //     break;
            // }
        }
        
        System.out.println("Most frequent char: " + mostFreq);
        System.out.println("Count: " + count);
