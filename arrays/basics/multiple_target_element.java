//first of all = its two min question dont take headache .
//follow this = > Count = (lastIndex - firstIndex + 1)
//make two function for first and for last occurence :
//note all code is same as binary search 
//for firstindex  change =
        if (arr[mid] == target) {
                result = mid;
                high = mid - 1;  // keep looking on the left side
            } 
//for last index == jsut plus sign instead of negetive 
        if (arr[mid] == target) {
                result = mid;
                high = mid + 1;  // keep looking on the left side
            } 
