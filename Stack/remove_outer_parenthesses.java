//do it bro very easy without stack only
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (count > 0) result.append(ch); // skip outermost '('
                count++;
            } else {
                count--;
                if (count > 0) result.append(ch); // skip outermost ')'
            }
        }
        return result.toString();
    }
