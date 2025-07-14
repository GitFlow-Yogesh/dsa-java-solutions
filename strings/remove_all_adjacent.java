//without inbuilt = its  efficient bcz we have to go through once so time O(N) and space also we r using O(N) = so its good and efficient .
public static String removeAdjacentDuplicates(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            // If top of "stack" matches current character, pop it (remove pair)
            if (top >= 0 && stack[top] == current) {
                top--; // pop (remove adjacent duplicate)
            } else {
                top++;           // push
                stack[top] = current;
            }
        }
        // Manually build result string from stack
        String result = "";
        for (int i = 0; i <= top; i++) {
            result += stack[i]; // safe for small input; char -> String
        }
        return result;
    }
