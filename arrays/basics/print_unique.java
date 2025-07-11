//steps = check if already came before , second step = check if count is more than once so to do so we have to count frequecy ==very basic ntg new but time O(n^2)
int[] arr = {1, 2, 2, 3, 4, 1, 5};

for (int i = 0; i < arr.length; i++) {
    int count = 0;

    for (int j = 0; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
            count++;
        }
    }

    // Print only if count == 1 and not already printed
    boolean alreadyPrinted = false;
    for (int k = 0; k < i; k++) {
        if (arr[k] == arr[i]) {
            alreadyPrinted = true;
            break;
        }
    }

    if (count == 1 && !alreadyPrinted) {
        System.out.println(arr[i]);
    }
}
//reduce time complexity by O(N)
//use hashmap or hashset
int[] arr = {1, 2, 2, 3, 4, 1, 5};

        // Step 1: Count frequency of each element
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Print elements with frequency 1
        System.out.println("Unique elements are:");
        for (int num : arr) {
            if (freqMap.get(num) == 1) {
                System.out.println(num);
            }
        }
