//easy and basic 
public static int findEquilibrium(int[] arr) {
        int totalSum = 0, leftSum = 0;
        for (int num : arr) totalSum += num;

        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; // totalSum now is right sum
            if (leftSum == totalSum) {
                return i; // return first equilibrium index
            }
            leftSum += arr[i];
        }
        return -1; // no equilibrium index
    }
