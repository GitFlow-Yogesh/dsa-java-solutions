//very easy h bro just compare 'a' and 'A' think how .isse easy ho hi nhi skta
//hint = a-A==32 make is positive using Math.abs()==32 thats it 
    public String makeGood(String s) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (!stk.isEmpty() && Math.abs(stk.peek() - curr) == 32) {
                // Characters differ by 32 (ASCII difference between upper and lower case)
                stk.pop();
            } else {
                stk.push(curr);
            }
        }
        // Build final string from stack
        StringBuilder sb = new StringBuilder();
        for (char c : stk) {
            sb.append(c);
        }
        return sb.toString();
    }
