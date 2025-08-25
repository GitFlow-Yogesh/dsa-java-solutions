//its very easy any operation just add 1 thats it
    public int numberOfSteps(int num) {
        if (num == 0) return 0;  // base case
        if (num % 2 == 0) {
            return 1 + numberOfSteps(num / 2); // even → divide
        } else {
            return 1 + numberOfSteps(num - 1); // odd → subtract 1
        }
    }
