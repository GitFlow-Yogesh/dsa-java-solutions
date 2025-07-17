//see we can do many ways like use two hashset but i want u to do using one hashset only =just one point line extra thats it 
//dont go ahead using below code think how can u solve using one hashset => thats why i didnt provide one hashset code below so think 
public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> check = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>(); // required only to collect result
        for (int x : nums1) {
            check.add(x);
        }
        for (int x : nums2) {
            if (check.contains(x)) {
                resultSet.add(x);     // add to result only once
                check.remove(x);      // remove from set to avoid duplicate processing
            }
        }
        // Convert resultSet to int[]
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }
        return result;
    }
