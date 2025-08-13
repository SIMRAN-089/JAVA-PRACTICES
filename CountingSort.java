public class CountingSort {
    public static void countingSort(int arr[]) {
        // Step 1: Find the largest value
        int largest = Integer.MIN_VALUE;
        for (int num : arr) {
            largest = Math.max(largest, num);
        }

        // Step 2: Create count array
        int count[] = new int[largest + 1];

        // Step 3: Fill count array
        for (int num : arr) {
            count[num]++;
        }

        // Step 4: Write back to arr in sorted order
        int j = 0; // index for arr
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 8, 3, 3, 1};
        countingSort(arr);
        printArr(arr);
    }
}
