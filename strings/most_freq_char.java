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
        }
        
        System.out.println("Most frequent char: " + mostFreq);
        System.out.println("Count: " + count);
