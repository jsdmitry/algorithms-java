class BinarySearch {
    static int Find(int[] array, int value) {
        var startIndex = 0;
        var endIndex = array.length - 1;
        while(startIndex <= endIndex) {
            int currentIndex = (startIndex + endIndex) / 2;
            if(array[currentIndex] == value) {
                return currentIndex;
            }
            if(value < array[currentIndex]) {
                endIndex = currentIndex - 1;
            } else {
                startIndex = currentIndex + 1;
            }
        }

        return -1;
    }
}
