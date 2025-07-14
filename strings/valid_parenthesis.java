//use stack its better 
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='[' || ch=='{' || ch=='('){
                stk.push(ch);
            }else{
                if(stk.isEmpty())return false;
                char top = stk.pop();
                if((ch == '}' && top != '{')||
                    (ch==']' && top != '[')||
                    (ch==')' && top != '(')){
                        return false;
                    }
            }
        }
        return stk.isEmpty();
    }
//sometime they dont alllow stack 
public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = 0;

        for (char c : s.toCharArray()) {
            // Push if it's an opening bracket
            if (c == '(' || c == '{' || c == '[') {
                stack[top++] = c;
            } else {
                // If stack is empty or top doesn't match, return false
                if (top == 0) return false;
                char last = stack[top - 1];

                if ((c == ')' && last != '(') ||
                    (c == '}' && last != '{') ||
                    (c == ']' && last != '[')) {
                    return false;
                }

                // Pop the top
                top--;
            }
        }

        // Stack should be empty if all brackets matched
        return top == 0;
    }
