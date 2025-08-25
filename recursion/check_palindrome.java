//okay h just formula banana aana chaiye 
public static boolean isPalindrome(int x) {
        if (x < 0) return false; // negatives are not palindromes
        return x == reverse(x, 0);
    }

    private static int reverse(int n, int rev) {
        if (n == 0) return rev;
        return reverse(n / 10, rev * 10 + n % 10);
    }
