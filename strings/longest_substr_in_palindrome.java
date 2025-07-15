//its easy only 2 case =one is for even = one is for odd and make sure u start treating each as mid of palindrome
class Main {
    public static void main(String[] args) {
        System.out.println("Jai Bajrang Bali");
        String test = "babad";
        int max = 1; // Minimum length of any palindrome is 1
        for (int i = 0; i < test.length(); i++) {
            // Odd-length palindrome (center at i)
            int j = 1;
            int oddCount = 1;
            while (i - j >= 0 && i + j < test.length() && test.charAt(i - j) == test.charAt(i + j)) {
                oddCount += 2;
                j++;
            }
            // Even-length palindrome (center between i and i+1)
            int evenCount = 0;
            j = 0;
            while (i - j >= 0 && i + 1 + j < test.length() && test.charAt(i - j) == test.charAt(i + 1 + j)) {
                evenCount += 2;
                j++;
            }
            int localMax = Math.max(oddCount, evenCount);
            if (localMax > max) {
                max = localMax;
            }
        }

        System.out.println("Max length palindrome substring is: " + max);
    }
}
