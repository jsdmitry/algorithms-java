public class QuickSort {
    static private void Swap(int [] arr, int index1, int index2) {
        var value = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = value;
    }

    static private void Sort(int[] arr, int startIndex, int endIndex) {
        int leftMarker = startIndex;
        int rightMarker = endIndex;
        int pivot = arr[(leftMarker + rightMarker) / 2];
        do {
            while(arr[leftMarker] < pivot) {
                leftMarker++;
            }

            while(arr[rightMarker] > pivot) {
                rightMarker--;
            }

            if(leftMarker <= rightMarker) {
                if(leftMarker < rightMarker) {
                    Swap(arr, leftMarker, rightMarker);
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < endIndex) {
            Sort(arr, leftMarker, endIndex);
        }
        if (startIndex < rightMarker) {
            Sort(arr, startIndex, rightMarker);
        }
    }

    static void Sort(int[] arr) {
        Sort(arr, 0, arr.length - 1);
    }
}
