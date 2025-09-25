//update same array thats it and keep track index 
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int index = 1; // Position for next unique element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index++] = nums[i];
            }
        }

        return index; // This is the length without duplicates
    }
