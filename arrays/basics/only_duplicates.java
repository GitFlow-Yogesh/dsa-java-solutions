//if array is sorted = it will print all duplicates 
        int[] arr={1,2,3,4,4,4,5,6,7,8};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
//if array is unsorted 
//way 1 =bruteforce and simple =using double loop == amazing que but time com = O(N^2) =remember by this way we r not using extra space its constant only
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    // Check if already printed by checking previous i's
                    boolean alreadyPrinted = false;
                    for (int k = 0; k < i; k++) {
                        if (arr[k] == arr[i]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }

                    if (!alreadyPrinted) {
                        System.out.println(arr[i]);
                    }

                    break; // break inner loop once duplicate found
                }
            }
        }
    }
}
//hashset = O(N) both time and space =for duplicate always use hashset bcz fast way to track seen elements= it doesnt allow duplicates 
//way 2 = reduce time com by O(n) but space com will increase = lets see
Set<Integer> seen = new HashSet<>();
Set<Integer> duplicates = new HashSet<>();

for (int num : arr) {
    if (seen.add(num)) {
    // Number is new → added to 'seen' successfully
    } else {
    // Number was already in 'seen' → it's a duplicate
    duplicates.add(num);
    }
}

for (int d : duplicates) {
    System.out.println(d);
}
//note i only know above two ways this is just for if u want to keep going inside this same que 
//way 3 = count the frequency thn sovle it easy so use hashmap= O(n) for both time and space =use only when u want frequency
//why hashmap = key value store =very fast operations 0(1) = either addd remove or update = clean one line code
Map<Integer, Integer> map = new HashMap<>();

for (int num : arr) {
    map.put(num, map.getOrDefault(num, 0) + 1);
}

for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    if (entry.getValue() > 1) {
        System.out.println(entry.getKey());
    }
}

