//bro just go step wise thats it only 2 min que 
public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric (manually)
            while (left < right && !isAlphaNumeric(s.charAt(left))) {
                left++;
            }
            while (left < right && !isAlphaNumeric(s.charAt(right))) {
                right--;
            }

            char c1 = toLowerCase(s.charAt(left));
            char c2 = toLowerCase(s.charAt(right));

            if (c1 != c2) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // Manually check if a character is alphanumeric
    private boolean isAlphaNumeric(char c) {
        return (c >= 'a' && c <= 'z') ||
               (c >= 'A' && c <= 'Z') ||
               (c >= '0' && c <= '9');
    }

    // Manually convert uppercase to lowercase
    private char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char)(c + 32);
        }
        return c;
    }
