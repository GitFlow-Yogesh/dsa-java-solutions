//its good problem just think little and solve example -> keep this thing .contains(X) and Integer.parseInt(x) sometime we forget basic 
public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String x : tokens){
            if(checktoken(x)){
                int b = stack.pop();
                int a = stack.pop();
                int result = calculate(a,b,x);
                stack.push(result);
            }else{
                stack.push(Integer.parseInt(x));
            }
        }
        return stack.pop();
    }
    public boolean checktoken(String x){
        return "+-/*".contains(x);
    }
    public int calculate(int a ,int b , String x){
        switch(x){
            case "+" : return a+b;
            case "-" : return a-b;
            case "/" : return a/b;
            case "*" : return a*b;
            default : throw new IllegalArgumentException("Invalid operator: " + x);
        }
    }
