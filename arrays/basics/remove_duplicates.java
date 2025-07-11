//remove duplicates with same array , dont use new array== only logic is given 
int index = 1;  // Position to insert the next unique element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[index - 1]) {
                arr[index] = arr[i];
                index++;
            }
        }
