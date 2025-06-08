//this function is enough for size increase .
private void resize() {
        int newCapacity = capacity * 2;
        int[] newArr = new int[newCapacity];

        for (int i = 0; i < size; i++) {
            newArr[i] = arr[(front + i) % capacity];
        }

        arr = newArr;
        front = 0;
        rear = size - 1;
        capacity = newCapacity;
    }
