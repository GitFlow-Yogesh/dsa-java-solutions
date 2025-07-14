//has two question = just one word change 
public static boolean isSubstring(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (m > n) return false;

        for (int i = 0; i <= n - m; i++) {
            int j;

            for (j = 0; j < m; j++) {
                if (s1.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
            }

            if (j == m) return true; // Full match      //if i return i instead of true thn we can tell the first occureace of substr 
        }

        return false;
    }
