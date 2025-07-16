//step 1 check length if not equal return false;
//step 2 count char and store in an array
//step 3 while counting from string 2 reduce if found thats itt
public static boolean areAnagrams(String s1, String s2) {
        // If lengths differ, cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Frequency array for lowercase letters
        int[] count = new int[26];
        //directly apply this else below two's
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;  // Add for string s
            count[t.charAt(i) - 'a']--;  // Subtract for string t
        }
        // Count characters in s1
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c >= 'A' && c <= 'Z') c = (char)(c + 32); // to lowercase
            count[c - 'a']++;
        }

        // Subtract character counts using s2
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (c >= 'A' && c <= 'Z') c = (char)(c + 32); // to lowercase
            count[c - 'a']--;
        }

        // Check if all counts are zero
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;
        }

        return true;
    }
