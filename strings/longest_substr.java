//with hashset very easy 
public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max = 0;
        HashSet<Character> uni= new HashSet<>();
        for(int right =0;right<s.length();right++){
            while(uni.contains(s.charAt(right))){
                uni.remove(s.charAt(left));
                left++;
            }
            uni.add(s.charAt(right));
            max = Math.max(max,right-left+1);
        }
        return max ;
    }
//without inbuit 
public int lengthOfLongestSubstring(String s) {
        int[] lastSeen = new int[256];  // Stores last index of each character
        for (int i = 0; i < 256; i++) {
            lastSeen[i] = -1;  // Initialize to -1 (not seen yet)
        }
        int max = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            // If current char was seen before and inside the window
            if (lastSeen[current] >= left) {
                left = lastSeen[current] + 1;
            }
            lastSeen[current] = right;  // Update last seen index
            max = Math.max(max, right - left + 1);  // Update max length
        }
        return max;
    }
