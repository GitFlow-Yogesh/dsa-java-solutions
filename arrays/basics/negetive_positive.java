//set all negetive left and positive right
//2 ways to solve = first with both O(N) time and space com = use 2 loop ,use list , use stream(very easy) = only if order matters 
                  = second use swapping if order doesnt matter 

ex : 1 = using list 
List<Integer> result = new ArrayList<>();

for (int num : arr) {
    if (num < 0) result.add(num);
}
for (int num : arr) {
    if (num >= 0) result.add(num);
}

System.out.println(result);


ex : 2 = using swapping = where space com is O(1) only but time will be same O(N)
  int i = 0;
 for (int j = 0; j < arr.length; j++) {
    if (arr[j] < 0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
    }
 }
 System.out.println(Arrays.toString(arr));

  
