public class MergeSort {
    
    // Merge function to merge two sorted halves
    public static void merge(int[] arr, int start, int mid, int end) {
        int[] merged = new int[end - start + 1];
        int i = start;     // left subarray
        int j = mid + 1;   // right subarray
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                merged[k++] = arr[i++];
            } else {
                merged[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            merged[k++] = arr[i++];
        }

        while (j <= end) {
            merged[k++] = arr[j++];
        }

        // Copy merged array back into original
        for (int l = 0; l < merged.length; l++) {
            arr[start + l] = merged[l];
        }
    }

    // Recursive merge sort function
    public static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) return;

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);       // sort left half
        mergeSort(arr, mid + 1, end);     // sort right half

        merge(arr, start, mid, end);      // merge both halves
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};

        mergeSort(arr, 0, arr.length - 1);

        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
