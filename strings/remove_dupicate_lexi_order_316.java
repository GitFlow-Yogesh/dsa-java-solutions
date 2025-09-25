//very easy 3 step = just logic keep in mind else ntg imp 
// step 1 - skip if appear in result;
//step 2 keep removing last if condition satisfy ex a<b and b appear later
//step now add thats it simple 
    public String removeDuplicateLetters(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // 1) skip if already in result
            boolean inResult = false;
            for (int k = 0; k < result.length(); k++) {
                if (result.charAt(k) == ch) { inResult = true; break; }
            }
            if (inResult) continue;
            // 2) try to remove bigger letters at the end if they appear later
            while (result.length() > 0) {
                char last = result.charAt(result.length() - 1);
                // check if last appears later in s (simple scan)
                boolean lastAppearsLater = false;
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == last) { lastAppearsLater = true; break; }
                }
                if (ch < last && lastAppearsLater) {
                    result.deleteCharAt(result.length() - 1); // remove last
                } else {
                    break;
                }
            }
            // 3) append current char
            result.append(ch);
        }
        return result.toString();
    }
