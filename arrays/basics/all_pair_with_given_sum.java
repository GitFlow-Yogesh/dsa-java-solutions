//its easy as u find complement means pair exist now so skip 
// if u dont find thn add it to map simple and print map using keyset() method by keeping in mind it works on Integer not int
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;

        Map<Integer, Integer> pairMap = new HashMap<>();

        for (int num : arr) {
            int complement = target - num;

            // store only if complement exists in array earlier
            if (pairMap.containsKey(complement)) {
                // already found complement, skip
                continue;
            }

            pairMap.put(num, complement);
        }

        // Print pairs
        for (Integer key : pairMap.keySet()) {
          System.out.println("(" + key + ", " + pairMap.get(key) + ")");
          }

