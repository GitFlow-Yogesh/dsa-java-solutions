#just convert to array thn swap than again convert to string and simple that it 
        char[] arr = name.toCharArray();  // Convert string to char array
        // Swap characters in the array to reverse it
        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        String newStr = new String(arr);  // Convert char array back to string
        System.out.println(newStr);       // Output: hsegoY
