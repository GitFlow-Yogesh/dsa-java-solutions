public static char bs(char[] letters, char target) {
        int left = 0, right = letters.length - 1;
        // char result = letters[0]; // default (wrap-around case)

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (letters[mid] > target) { // possible answer
                right = mid - 1;        // look left for smaller candidate
            } else {
                left = mid + 1;         // look right
            }
        }

        return letters[left%letters.length];
    }
