//easy first find first index thn another one if not found thn -1 already h by default simple h 
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            int indexInNums2 = -1;
            // Find the index of nums1[i] in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    indexInNums2 = j;
                    break;
                }
            }

            // Now find the next greater element to the right in nums2
            int nextGreater = -1;
            for (int k = indexInNums2 + 1; k < nums2.length; k++) {
                if (nums2[k] > nums1[i]) {
                    nextGreater = nums2[k];
                    break;
                }
            }
            result[i] = nextGreater;
        }

        return result;
    }
}
