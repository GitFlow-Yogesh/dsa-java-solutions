//same as find ceiling but dont check first if statement and make sure we have to written a letter okay
//so if celing we r returning start here also same right 
public static char bs(char[] letters, char target) {
        int left = 0, right = letters.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] > target) { 
                right = mid - 1;       
            } else {
                left = mid + 1;      
            }
        }
        return letters[left%letters.length]; //using % ensure safe indexing while returning 
    }


//extra part just for your knowledge why % okay solve this below puzzle thats it 
// letters = ['c','f','j'], target = 'j'
// start = 3
// letters[start % letters.length] = letters[0] = 'c' ✅
