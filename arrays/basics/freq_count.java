//what a simple logic dude 
int[] arr = {1, 2, 2, 3, 1, 4, 2};

        for (int i = 0; i < arr.length; i++) {
            boolean alreadyCounted = false;

            // Check if this element has already been counted
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue; // Skip duplicate
            }

            // Count frequency of arr[i]
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " appears " + count + " times");
        
