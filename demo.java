import java.util.*;

public class demo {
 public static void bubblesort(int arr[]) {
    int count = 0;  // ✅ to count how many swaps happened

    for(int turn = 0; turn < arr.length - 1; turn++) {
        boolean swapped = false;

        for(int j = 0; j < arr.length - 1 - turn; j++) {
            if(arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
                count++;  // ✅ increase count on every swap
            }
        }

        if(swapped == false) {
            turn = arr.length;
        }
    }

    System.out.println("Total swaps: " + count);  // ✅ print swap count
 }

 public static void PrintArr(int arr[]) {
    for(int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
 }

 public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5};  // sorted array → should give 0 swaps
    bubblesort(arr);
    PrintArr(arr);
 }
}
