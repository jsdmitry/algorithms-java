public class QuickSelect {
    static private int FindSmallestElement(int[] array, int startIndex, int endIndex, int targetIndex) {
        var index = startIndex;

        swap(array, index, targetIndex);

        for (int i = startIndex + 1; i <= endIndex; i++) {
            if(array[i] < array[startIndex]) {
                swap(array, i, ++index);
            }
        }

        swap(array, index, startIndex);

        if(index == targetIndex) {
            return array[index];
        }

        if(index > targetIndex) {
            return FindSmallestElement(array, startIndex, index - 1, targetIndex);
        } else {
            return FindSmallestElement(array, index + 1, endIndex, targetIndex);
        }
    }

    static private void swap(int[] array, int index1, int index2) {
        var value1 = array[index1];
        array[index1] = array[index2];
        array[index2] = value1;
    }

    static int FindSmallestElement(int[] array, int index) {
        return FindSmallestElement(array,0, array.length - 1, index);
    }
}
