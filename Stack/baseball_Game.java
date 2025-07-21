//very basic h bro just go with flow of strings give handle one by one case thats it =1 min problem only no mind used 
public int calPoints(String[] operations) {
        int sum = 0;
        Stack<Integer> stk = new Stack<>();
        for (String x : operations) {
            if (x.equals("D")) {
                if (!stk.isEmpty()) {
                    int top_ele = stk.peek();
                    int newel = 2 * top_ele;
                    stk.push(newel);
                }
            } else if (x.equals("C")) {
                if (!stk.isEmpty()) {
                    stk.pop();
                }
            } else if (x.equals("+")) {
                int size = stk.size();
                int a = stk.get(size - 1);
                int b = stk.get(size - 2);
                stk.push(a + b);

            } else {
                try {
                    int num = Integer.parseInt(x);
                    stk.push(num);
                } catch (NumberFormatException e) {
                    System.out.println("NOt a number");
                }

            }
        }
        for (int x : stk) {
            sum += x;
        }
        return sum;
    }
